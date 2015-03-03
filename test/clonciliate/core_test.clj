(ns clonciliate.core-test
  (:require [clojure.test :refer :all]
            [clonciliate.core :refer :all]))

(deftest parseOperationLineOutfputFormatTest
  (testing "A operational line output format is a Map."
    (is (instance? String (parseOperationalLine "0127-02-201515058645369203120837  50294599XXXXXXXX0263    VXDN26-02-201512454866932905ON 00000001000+00000000000040+0000000000960+0032724325901                                      EUR001352316030      0000000000000+
")))
  ))

