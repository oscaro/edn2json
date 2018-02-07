(ns edn2json.core-test
  (:require [clojure.test :refer :all]
            [edn2json.core :as core]))

(deftest single-line
  (is (= "{\"foo\":42,\"bar\":[1,2,null]}\n"
         (with-out-str
           (with-in-str "{:foo 42 \"bar\" (1 2 nil)}"
             (core/-main))))))

