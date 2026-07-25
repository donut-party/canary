(ns donut.canary-test
  (:require
   [donut.canary :as canary]
   #?(:clj  [clojure.test :refer [deftest is]]
      :cljs [cljs.test :refer [deftest is] :include-macros true])))

(deftest hello-test
  (is (= "Hello, world!" (canary/hello "world"))))
