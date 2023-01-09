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
;
; (jdbc/db-do-commands db
;                      "create table User (
;                        UserId integer primary key autoincrement,
;                        FirstName varchar(255) not null,
;                        LastName varchar(255) not null,
;                        Username varchar(255) not null,
;                        Password varchar(255) not null,
;                        Role varchar(255) not null
;                        );")
;
;(jdbc/insert! db :User testdata)
;(jdbc/query db ["SELECT * FROM User"])
;
;(jdbc/db-do-commands db
;                     "create table Event (
;                       EventId integer primary key autoincrement,
;                       DateAndTime varchar(255) not null,
;                       Place varchar(255) not null,
;                       Description varchar(255) not null,
;                       Title varchar(255) not null
;                       );")
;
;(jdbc/insert! db :Event {:Title "Protiv trovaca",
;                         :DateAndTime "08.01.2023. u 13h",
;                         :Place "Beograd, Studentski trg",
;                         :Description "Protestna setnja od Studentskog trga do zgrade Vlade"})
;
;(jdbc/query db ["SELECT * FROM Event"])
;
;(jdbc/db-do-commands db
;                     "create table Prize (
;                       PrizeId integer primary key autoincrement,
;                       UserId integer references User(UserId),
;                       Description varchar(255) not null,
;                       Title varchar(255) not null
;                       );")
;
;(jdbc/insert! db :Prize {:UserId 1,
;                         :Title "DM kupon",
;                         :Description "1.000 dinara u DM drogerijama."})
;
;(jdbc/query db ["SELECT * FROM Prize"])
;
;(jdbc/db-do-commands db
;                     "create table Attendance (
;                       EventId integer references Event(EventId),
;                       UserId integer references User(UserId),
;                       primary key(\"EventId\",\"UserId\")
;                       );")
;
;(jdbc/insert! db :Attendance {:UserId 1,
;                              :EventId 1})
;
;(jdbc/query db ["SELECT * FROM Attendance"])

(defn getAllEvents []
  (jdbc/query db ["SELECT * FROM Event"]))

(getAllEvents)
