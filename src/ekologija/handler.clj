(ns ekologija.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ekologija.db :as db]
            [ekologija.pages :as pages]))



(defroutes app-routes
  (GET "/" [] (pages/index (db/getAllEvents)))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
