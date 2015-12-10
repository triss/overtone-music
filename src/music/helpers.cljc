(ns music.helpers)

;;from str-utils2
;;https://github.com/richhickey/clojure-contrib/blob/a1c66df5287776b4397cf3929a5f498fbb34ea32/src/main/clojure/clojure/contrib/str_utils2.clj
(defn #^String chop
  "Removes the last character of string, does nothing on a zero-length string."
  [#^String s]
  (let  [size  (count s)]
    (if  (zero? size)
      s
      (subs s 0  (dec  (count s))))))

(defn reverse-get
  "Returns the key of the first val in maps vals that equals v.
  Non-deterministic if (vals m) contains duplicates and map isn't sorted."
  [m v]
  (let [f (first m)
        n (next m)]
    (if (= (val f) v)
      (key f)
      (when n (reverse-get n v)))))

(defn choose-n
  "Choose n random elements from col."
  [n col]
  (take n (shuffle col)))
