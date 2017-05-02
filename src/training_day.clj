(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x] (* x x))

(square 2)

(defn average [a b] (/ (+ a b) 2))

(average 2 4)

(+ 4 (* 2 3))

(+ 3 4 5 6)

((fn [who] (str "Hello, " who "!")) "Jani")

(fn [name] (str "Welcome to Rivendell mr " name))

(def hello (fn [who] (str "Hello, " who "!")))
(hello "beautiful")

(defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))