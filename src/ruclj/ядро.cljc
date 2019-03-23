(ns ruclj.ядро)

(defmacro перевести [оригинал перевод]
  `(defmacro ~перевод [& параметры#]
     (cons (quote ~оригинал) параметры#)))

(defmacro перевести-все [оригинал перевод & прочее]
  (if (seq прочее)
    `(do (перевести ~оригинал ~перевод)
         (перевести-все ~@прочее))
    `(перевести ~оригинал ~перевод)))

(перевести-все
 aclone клонмасс
 add-classpath добавить-путь-классов
 add-watch добавить-набл
 agent агент
 agent-error ошибка-агента
 aget элмасс
 alength длмасс
 alias псеводним
 all-ns все-пи
 alter изменить
 alter-meta! изменить-мета!
 alter-var-root изменять-корень-перем
 amap отобрмасс
 ancestors предки
 and и
 any? какой-либо?
 apply примен
 areduce редуцмасс
 array-map отобр-массив
 as-> как->
 aset устмасс
 aset-boolean устмасс-бул
 aset-byte устмасс-байт
 aset-char устмасс-симв
 aset-double устмасс-двточ
 aset-float устмасс-плав
 aset-int устмасс-цел
 aset-long устмасс-длцел
 aset-short устмасс-корцел
 assert утв
 assoc ассоц
 assoc! ассоц!
 assoc-in ассоц-в
 associative ассоциативное?
 atom атом
 await ждать
 await-for ждать-в-теч
 bases базовые
 bean боб
 bigdec болдес
 bigint болцел
 biginteger болцелое
 binding привязать
 bit-and бит-и
 bit-and-not бит-и-не
 bit-clear бит-стереть
 bit-flip бит-поменять
 bit-not бит-не
 bit-or бит-или
 bit-set бит-уст
 bit-shift-left бит-сдвиг-влево
 bit-shift-right бит-сдвиг-вправо
 bit-test бит-тест
 bit-xor бит-иили
 boolean бул
 boolean-array бул-массив
 boolean? бул?
 booleans булм
 bound-fn связ-фн
 bound-fn* связ-фн*
 bound связ?
 bounded-count огр-счет
 butlast кромепосл
 byte байт
 def опр
 defn опрф
 defmacro опрмакро
 if если
 map отобр
 list список
 cons конс
 loop цикл
 recur рекур
 let пусть
 range диапазон
 inc увел
 print вывод
 println выводстр
 format формат
 do исп
 count счет
 fn фн
 cond усл
 condp услп
 with-out-str с-выводом-в-строку
 dec умен)

