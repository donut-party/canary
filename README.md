# canary

A minimal hello-world Clojure/ClojureScript library with no purpose other than
proving out the donut framework's GitHub Actions test/build/deploy pipeline
(see [shared-workflows](https://github.com/donut-party/shared-workflows))
before it's rolled out to the rest of the donut-party libraries.

``` clojure
(require '[donut.canary :as canary])
(canary/hello "world") ;; => "Hello, world!"
```
