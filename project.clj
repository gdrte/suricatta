(defproject gdrte/suricatta "1.3.11"
  :description "High level sql toolkit for clojure (backed by jooq library)"
  :url "https://github.com/gdrte/suricatta"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.10.0" :scope "provided"]
                 [org.jooq/jooq "3.11.11"]]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  :profiles
  {:dev {:global-vars {*warn-on-reflection* false}
         :jvm-opts ["-Dclojure.compiler.direct-linking=true"]
         :aliases {"test-all"
                   ["with-profile" "dev,1.10:dev" "test"]}
         :plugins [[lein-ancient "0.6.10"]]
         :dependencies [[org.postgresql/postgresql "9.4.1212"]
                        [com.h2database/h2 "1.4.193"]
                        [cheshire "5.8.1"]]}
   :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}}

  :java-source-paths ["src/java"])
