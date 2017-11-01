(ns ^:figwheel-no-load isil-db.app
  (:require [isil-db.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
