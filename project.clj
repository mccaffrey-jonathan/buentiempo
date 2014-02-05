(defproject annual-weather "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [ [compojure "1.1.1"]
                  [hiccup "1.0.0"]
                  [http-kit "2.1.16"]
                  [org.clojure/clojure "1.5.1"]
                  [org.clojure/data.json "0.2.4"] 
                  [ring/ring-json "0.2.0"] 
                  [uncomplicate/fluokitten "0.3.0"] ]
  :ring {:handler annual-weather.routes/app}
  :plugins [[lein-ring "0.7.1"]])
