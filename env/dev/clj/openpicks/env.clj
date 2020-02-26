(ns openpicks.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [openpicks.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[openpicks started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[openpicks has shut down successfully]=-"))
   :middleware wrap-dev})
