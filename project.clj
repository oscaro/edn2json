(defproject com.oscaro/edn2json "0.1.1-SNAPSHOT"
  :description "Convert EDN to JSON"
  :url "https://github.com/oscaro/edn2json"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cheshire            "5.8.0"]]
  :main edn2json.core
  :profiles {:uberjar {:aot :all}})
