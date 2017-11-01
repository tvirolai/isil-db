(ns isil-db.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [isil-db.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[isil-db started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[isil-db has shut down successfully]=-"))
   :middleware wrap-dev})
