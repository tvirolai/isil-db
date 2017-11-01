(ns user
  (:require [luminus-migrations.core :as migrations]
            [isil-db.config :refer [env]]
            [mount.core :as mount]
            [isil-db.figwheel :refer [start-fw stop-fw cljs]]
            isil-db.core))

(defn start []
  (mount/start-without #'isil-db.core/repl-server))

(defn stop []
  (mount/stop-except #'isil-db.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))


