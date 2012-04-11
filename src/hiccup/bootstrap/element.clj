(ns hiccup.bootstrap.element
  (:use [hiccup def element]))

(defn icon
  "Create a Bootstrap icon of the supplied type.
  See: http://twitter.github.com/bootstrap/base-css.html#icons"
  [type]
  [:i {:class (str "icon-" (name type))}])
