(ns hiccup.bootstrap.page
  (:use hiccup.page))

(defn include-bootstrap
  "Add Bootstrap CSS and JS resources to the page."
  []
  (list 
   (include-css "/bootstrap/css/bootstrap.css")
   (include-css "/bootstrap/css/bootstrap-responsive.css")
   (include-js  "/bootstrap/js/bootstrap.js")))