(ns hiccup.bootstrap.page
  (:use hiccup.page))

(defn include-bootstrap
  "Add Bootstrap CSS and JS resources to the page."
  []
  (list
   (include-js  "/bootstrap/js/jquery-3.4.1.min.js")
   (include-js  "/bootstrap/js/bootstrap.bundle.min.js")
   (include-css "/bootstrap/css/bootstrap.min.css")))

(defn fixed-layout
  "Encase its contents in a fixed layout container."
  [& content]
  [:div.container content])
