(ns isil-db.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [isil-db.core-test]))

(doo-tests 'isil-db.core-test)

