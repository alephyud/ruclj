(ns ruclj.тест
  (:require [clojure.test])
  (:use [ruclj.ядро]))

(перевести-все
 clojure.test/deftest опртест
 clojure.test/testing тест-для
 clojure.test/is верно
 clojure.test/are верны
 clojure.test/use-fixtures исп-вспом)
