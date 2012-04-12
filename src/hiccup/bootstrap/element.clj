(ns hiccup.bootstrap.element
  (:use [hiccup def element])
  (:require [clojure.string :as str]))

(defn icon
  "Create a Bootstrap icon of the supplied type.
  See: http://twitter.github.com/bootstrap/base-css.html#icons"
  [type]
  [:i {:class (str "icon-" (name type))}])

(defn- classes-from-keys [prefix keys]
  (->> keys
       (map #(str prefix (name %)))
       (str/join " ")))

(defn table
  "Create a Bootstrap table with the supplied styles, head and body. The head
  should be a sequence of column names. The body should be a seq of seqs,
  containing the table data. The styles should be a seq of keywords of the set
  #{:bordered :striped :condensed}.

  See: http://twitter.github.com/bootstrap/base-css.html#tables"
  [& {:keys [styles head body]}]
  (let [classes (str "table " (classes-from-keys "table-" styles))]
    [:table {:class classes}
     [:thead
      [:tr
       (for [col head] [:th col])]]
     [:tbody
      (for [row body]
        [:tr
         (for [cell row] [:td cell])])]]))
