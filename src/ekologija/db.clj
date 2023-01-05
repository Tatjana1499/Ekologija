(ns ekologija.db
  (  :require [clojure.java.jdbc :as jdbc])
  (:gen-class))

(def testdata
  { :FirstName "Petar",
   :LastName "Peric",
   :Username "Pera",
   :Password "12345",
   :Role "User"
   })

(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "db/DemoDB.db"
   })

 (jdbc/db-do-commands db
                      "create table User (
                        UserId integer primary key autoincrement,
                        FirstName varchar(255) not null,
                        LastName varchar(255) not null,
                        Username varchar(255) not null,
                        Password varchar(255) not null,
                        Role varchar(255) not null
                        );")

(jdbc/insert! db :User testdata)
(jdbc/query db ["SELECT * FROM User"])
