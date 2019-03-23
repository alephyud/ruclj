# Clojure по-русски

Просто потому что могу.

## Usage

Add to your dependencies:

`[ruclj "0.1.0"]`

Then:

```clojure
(use 'ruclj.ядро)

(опрф привет [имя]
  (выводстр
   (если имя
     (стр "Привет, " имя)
     "Привет!")))
```

## Todo

- Translate more symbols from `clojure.core`, `clojure.test` and other namespaces. As of now, only essential symbols have been translated.
- Make symbols inherit the docstrings of the original symbols.

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
