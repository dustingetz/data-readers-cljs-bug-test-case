(ns app.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            #_ [app.core :refer []]))

(deftest silly-test
  (is (= (+ 1 1)
         2)))


(deftest test-custom-reader                                 ; pass
  (let [foo #cljs/tag 1]
    (is (= foo 1))))

(deftype test-custom-reader-app-type                        ; fail
  (let [foo #app/Foo[1]]
    (is (= (.-i foo) 1))))
