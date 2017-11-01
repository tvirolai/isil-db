(ns isil-db.app
  (:require [isil-db.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
