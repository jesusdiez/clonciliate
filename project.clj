(defproject clonciliate "0.1.0-SNAPSHOT"
  :description "Management of bank remittance files to conciliate payments"
  :url "http://github.com/jesusdiez/clonciliate"
  :license {:name "GPLv2.0"
            :url "http://www.gnu.org/licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [instaparse "1.3.5"]]
  :main ^:skip-aot clonciliate.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
