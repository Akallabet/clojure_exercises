(ns clojure-exercises.core
  (:gen-class))

(defn mods [n nums] (reduce (fn [res num] (and res (= (mod n num) 0))) true nums))

(defn fizz-buzz-number [n] (cond
                             (mods n [3 5]) "fizzbuzz"
                             (mods n [3]) "fizz"
                             (mods n [5]) "buzz"
                             :else n))

(defn fizz-buzz [arr] (map fizz-buzz-number arr))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
