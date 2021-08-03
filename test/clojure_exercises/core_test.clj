(ns clojure-exercises.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [clojure-exercises.core :refer [fizz-buzz]]))

(deftest empty-test
  (testing "Empty"
    (is (= [] (fizz-buzz [])))))

(deftest number-one-test
  (testing "Array with number one"
    (is (= [1] (fizz-buzz [1])))))

(deftest first-three-test
  (testing "Array with first three numbers"
    (is (= [1 2 "fizz"] (fizz-buzz [1 2 3])))))

(deftest first-five-test
  (testing "Array with first five numbers"
    (is (= [1 2 "fizz" 4 "buzz"] (fizz-buzz (range 1 6))))))

(deftest first-fifteen-test
  (testing "Array with first fifteen numbers"
    (is (= [1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz"] (fizz-buzz (range 1 16))))))