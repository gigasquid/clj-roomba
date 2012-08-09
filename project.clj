(defproject repl-roomba "1.0.0-SNAPSHOT"
  :description "Fun Sample Project to Control Roomba with Clojure"
  :dependencies [ [org.clojure/clojure "1.3.0"]
                  [roombacomm "0.96"]
                  [rxtxcomm "0103"]]
  :jvm-opts [~(str "-Djava.library.path=roombacomm/")])