(ns ekologija.pages
  (:require [hiccup.page :refer [html5]]))

(defn index [events]
  (html5 [:h1 "EVENTS"]
         (for [e events]
           [:h2 (:title e)])))
