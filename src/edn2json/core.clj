(ns edn2json.core
  (:require [clojure.edn :as edn]
            [cheshire.core :as json])
  (:import [java.io BufferedReader PushbackReader])
  (:gen-class))

(defn -main
  [& args]
  (if (some #{"--slurp"} args)
    ;; one EDN
    (do
      (json/generate-stream (edn/read (PushbackReader. *in*)) *out*)
      (println))

    ;; one EDN per line
    (doseq [line (line-seq (BufferedReader. *in*))]
      (json/generate-stream (edn/read-string line) *out*)
      (println))))
