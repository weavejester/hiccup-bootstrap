(ns hiccup.bootstrap.middleware
  (:use compojure.core)
  (:require [compojure.route :as route]))

(defn wrap-bootstrap-resources
  "Add Bootstrap resources to the handler."
  [handler]
  (routes
   (route/resources "/bootstrap" {:root "bootstrap/public"})
   handler))