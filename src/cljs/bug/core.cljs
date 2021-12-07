(ns bug.core
  (:require [oops.core :refer [ocall]]))

(defn bug1 []
  (- (ocall js/Math :random) (ocall js/Math :random)))

(defn bug2 []
  (- ^js/number (ocall js/Math :random) ^js/number (ocall js/Math :random)))