(ns what-and-why.core)












[:what-is-clojure
















 ["programming-language"



  "function-oriented"

  {:relies-on  [:immutability
                :pure-functions]

   :focuses-on [:simplicity
                :function-orientation
                "data orientation"
                "constraining state"]

   :avoids     [:complexity
                :object-orientation
                :unnecessary-noise]}












  "properties that make it stand out among other languages"

  {:lisp-dialect         {:source-code-is-lists "statements are surrounded by (...)"
                          :prefix-notation      "(+ 2 2 3)"
                          :simple-to-port       ["very small grammar"
                                                 "code is already the abstract syntax tree AST"
                                                 "no rules of precedence necessary"
                                                 "hosted language" "leverages on the host platform"
                                                 "code highly reusable between platforms"]}
   :homoiconicity        ["code is data"
                          "data is code"
                          {:good-for :macros}]

   :immutable-by-default [:all-data-is-immutable
                          [:maps :lists :vectors :sets :primitives "etc."]]

   :elegant              [:expressive "idiomatic and brief"
                          :concise "no noise: no commas, no semi-colons, no generics"
                          :focused "you see only your solution"]

   :dynamic              [:flexible ["less ceremony"
                                     "leverages reuse of code"
                                     "duck typing"
                                     "static typing is a big investment for little profit"]]}





  "highly interactive development"

  {:repl       [:read
                :evaluate
                :print
                :loop]

   :runs       "in an environment, can be even production"

   :encourages :exploration

   :similar-to {:tdd "Test Driven Development"
                :but ["highly interactive"
                      "running in a real environment"
                      "persist in unit test, relevant operations experimented in the REPL"]}

   :interactive-development
               {:lets-you             ["experiment" "shape ideas" "test"]
                :constantly-switching {:between      [:editor :repl]
                                       :continuously ["check your code"
                                                      "test your ideas"
                                                      "reshape code"]}}}







  "data oriented"
  ["leverages on all data types"
   {:maps    {:key                    "value 1"
              "a key can be a string" "value for the string on the left"
              3                       "you can combine types in keys and values"
              :function-1             (fn [n] (+ 1 n))
              "what was that?"        ":function-1 (a key in the map) is associated to a function"
              (fn [n] (* n n))        "a function can even be a key in a map"
              :syntax                 "Are declared using {}"}

    :lists   ("first element"
               :second-element
               3
               \c
               "are declared using ()"
               "linked list")
    :vectors ["first element"
              :second-element
              3
              "etc..."
              "random indexed access"
              "are declared using []"]
    :sets    #{"first element"
               :second-element
               3
               "etc..."
               "are declared using #{}"}}

   "They are all IMMUTABLE by default"

   "They all nest" "like in this presentation"

   "This notation is called " :edn "Extensible data notation" "https://github.com/edn-format/edn"

   "No classes" ["we work only with data in these data structures, "
                 "no statically typed classes, no mappings!"]

   "Better a function that does many things, then many functions that do 1 (same) thing"]]




















 "performant"





 ["the most performant language running on the JVM"

  "Immutable BUT" "No copying"

  "Persistent data structures"

  "no copying"

  "NO LOCKING" "levereges concurrency"]














 "syntax"

 {"statements are lists"

  [(first "element" "identifies what needs to be done, they are evaluated")

   (rest "elements" "are arguments")

   "(+ 3 4)" "+ identifies the add function, 3 and 4 are the arguments"]




















  "symbols"


  {:keywords      ["symbols that evaluate to themselves"
                   "mostly used as keys in maps"
                   "Resemble PARTIALLY what an enum is in Java"
                   "written with a : colon in front of them"]

   :special-forms ["Symbols with special (different) evaluation rules"
                   :examples #{(def my-var 7) (if (< 1 x) x 1)
                               ["and others like" "do" "let" "fn" "loop" "throw"]}]
   :variables     ["global"
                   "defined using (def <var> <value>)"
                   (def my-var 7)]                          ;declares variable my-var and sets it to value 7

   :functions     ["declared using (defn ...)"
                   (defn square [x] (* x x))]

   :literals
                  {:strings        "Enclosed by double-quotes"
                   :numbers        "Ints are indefinitely long (are automatically converted to BigInt)"
                   :floating-point "Read as BigDecimals"
                   :ratios         ["supported as they are"
                                    1/4 "is a value" "not an operation" (/ 1 4) "is not the same as" 1/4]
                   :chars          ["Preceded by \ " \a \newline \space]
                   :nil            ["nothing" "no value" (= nil false) "tests to logical false" :falsy]}}



  "special uses of keywords"




  {(def my-map {:my-key-1 5}) "I declare a map"

   (get my-map :my-key-1)     "Functions that gets the value for the given keyword"

   (:my-key-1 my-map)         "evaluates to 5"

   (my-map :my-key-1)         "also evaluates to 5"}}

















 "Install"

 {:language   "https://clojure.org/guides/getting_started"

  :build-tool {:leiningen ["https://leiningen.org/"
                           "we will use this one in our work"]
               :boot      "https://github.com/boot-clj/boot"
               :deps.edn  "a newer build possibility included in clojure"}

  :editor     {:cursive          ["https://cursive-ide.com/"
                                  "Editor plugin for Intellij"
                                  "we will use this one in our work"]
               :emacs            "Lisp based editor, native editor for clojure"
               :counterclockwise "Editor for eclipse"}}
















 "run"


 ["lein new app hello-world" "creates an empty Leiningen project"

  "lein run"

  "lein repl"]























 "references"


 {"Clojure for the Brave and True"             "Excellent and friendly beginners book"

  "The joy of Clojure, Second Edition"         "Very rich book for beginners"

  "Clojure Programming (by C.Emerick et. al.)" "Good punctual book for fundaments"

  "clojure.org"                                "Official website with many resources and pointers"

  "ClojureTV"                                  "Official channel in Youtube"}



















 :end]















