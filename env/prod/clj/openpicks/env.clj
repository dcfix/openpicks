(ns openpicks.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[openpicks started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[openpicks has shut down successfully]=-"))
   :middleware identity})
