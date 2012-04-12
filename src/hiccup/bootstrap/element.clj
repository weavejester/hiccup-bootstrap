(ns hiccup.bootstrap.element
  (:use [hiccup def element]))

(defn icon
  "Create a Bootstrap icon of the supplied type.
  See: http://twitter.github.com/bootstrap/base-css.html#icons"
  [type]
  [:i {:class (str "icon-" (name type))}])

(defn table
  "Create a Bootstrap table with the supplied head and body."
  [& {:keys [head body]}]
  [:table.table
   [:thead
    [:tr
     (for [col head] [:th col])]]
   [:tbody
    (for [row body]
      [:tr
       (for [cell row] [:td cell])])]])
