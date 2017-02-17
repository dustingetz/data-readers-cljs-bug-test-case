(ns app.core)

(defn main []
  (let [c (.. js/document (createElement "DIV"))]
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))

;(deftype Foo [i])

(defn read-Foo [i] i #_(->Foo i))
