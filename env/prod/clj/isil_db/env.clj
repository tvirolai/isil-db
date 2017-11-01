(ns isil-db.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[isil-db started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[isil-db has shut down successfully]=-"))
   :middleware identity})
