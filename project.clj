(defproject ekologija "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-defaults "0.3.2"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.xerial/sqlite-jdbc "3.23.1"]
                 ;;[mysql/mysql-connector-java "5.1.18"]
                 ;;[org.xerial/sqlite-jdbc "3.40.0.0"]
                 ]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler ekologija.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})

