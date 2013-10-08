(defproject sandbox "0.1.0-SNAPSHOT"
  :description "My playground for clojure/clojurescript stuff"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]
                 [compojure "1.1.5"]]

  :plugins [[lein-cljsbuild "0.3.3"]
            [lein-ring "0.8.7"]]

  :ring {:handler sandbox.core/handler}

  :cljsbuild {
              :builds
              [{
                :source-paths ["src/cljs"]
                :compiler {
                           :output-to "resources/public/js/sandbox.js"
                           :optimizations :whitespace
                           :pretty-print true}}]})
