(ns ekologija.db
  (  :require [clojure.java.jdbc :as j])
  )

(def db {:dbtype "postgresql"
         :dbname "postgres"
         :host "localhost"
         :user "postgres"
         :password "admin"})


(j/insert! db :table_test1 {:name "Zika"})
(j/query db ["SELECT * FROM table_test1"])
(j/delete! db :table_test1 ["id = ?" 2])



