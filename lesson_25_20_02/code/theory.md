### Список полученных знаний и умений
    1. Типы переменных (ТИП , имя, значение ) - храняться в ячейках ОЗУ
    2. Накопление значения в переменной (x = x + 1, x++)
    3. Вывод текста и "результатов" на экран (sout)
    4. Запрос данных от пользователя - число, строка, символ (Scanner)
    5. Проверка условия, выбор - if...else, switch...case
    6. Проверка делимости нацело (if (i%2 == 0) - делимость на 2)
    7. Циклы - while, do...while, for
    8. Массивы (Array) - объявление и наполнение
    9. Датчик случайных чисел
    10. ASCII - коды
    11. Формальная логика, логические операторы
    12. Методы (перенос полезного и частоиспользуемого еода в вызываемые функции/процедуры/методы)
    13. Алгоритм запуска цикла (параметр, условие на парамерт, шаг увеличения параметра)
    14. Руководство по разработке программ 
    15. Теорема Бёма-Якопини (три управляющих структуры)
    16. Вывод массива на печать по порядку и задом наперед
    17. try .. cach - работа с Exceptions (errors)
    18. Debugger - 
    19. ArrayList - что это? Зачем?
    20. LikedList - что это? Зачем?
    21. Разделять слово по буквам 
    22. Разделять проедложение на слова
    23. Умеение организовать бесконечный цикл для ввода данных пользователем
    24. Сравнение 2-х чисел и выбор min и max, поиск min и max в массиве

### HashSet - что это такое и для чего это нужно
Set в переводе с английского - это "множество каких-то элементов" в нашем контексте.
Особенность этого множества в том, что оно может **хранить только уникальные значения, элементы**.
**Пример:**
бренды автомобилей - это множество, где каждый элемент должен быть уникален.
Их сейчас порядка 100...

Давайте приведем примеры полезных Set из жизни:
- индексы для почтовых адресов
- VIN автомобилей
- серийный номер изделия
- буквенный алфавит
- штирх-код
- ссылки в Интернете
- из финансовой сферы:
- ... (приведите свой пример)

Вопрос: Как ведет себя Set при попытке добавить в него имеющийся уже в нем элемент?
Ответ: игнорирует эту операцию.

Давайте это проверим...
**Задача 1:** Сформировать HashSet из букв латинского алфавита, попытаться добавить в это множество
уже существующую букву, проверить, что будет происходить...
[Полезная ссылка на таблицу кодов]( Полезная ссылка https://xn----7sbbaqhlkm9ah9aiq.net/news-new/kodi-ascii-simvolov.html)
**_Синтаксис для инициализации HashSet:_**
HashSet<Type> myHashSet = new HashSet<Type>();

**Задача 2:** Написать приложение, которое позволит понять,
из каких мест на данную почту приходят письма.

### Как вычисляется Hash ???
Метод hashCode() – возвращает хэш-код для данной строки (набор символов).
Хэш-значение пустой строки равно нулю.
hashCode(строка) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1], ^ - это возведение в степень
s[0] - это 1-й элемент строки, s[1] - 2-й элемент и т.д.
Простое число 31 подобрано опытным путем

### Для чего нужен Hash? Откуда он взялся?
Hash - это ключ (уникальный идентификатор) для hash-таблицы, в которой хранятся пары значений:
hash 1-го элемента | 1-й элемент множества
hash 2-го элемента | 2-й элемент множества
...

### Еще раз про HashSet (summary)
1. Принципиальная невозможность повторений элементов множества (коллекции);
2. Нет порядка, при добавлении имеющегося элемент попадает куда-то внутрь множества
   (ПРОВЕРИТЬ самостоятельно на почтовых индексах);
3. Нет индексов элементов, у каждого элемента есть Hash, по которому он и определяется (находится).

### Практикум:
Задача 1: посчитать количество разных слов в тексте (частоту повторений пока посчитать не можем).
Это "класическая" задача на HashMap и "лексический разбор".

Задача 2: имеется список чисел, необходимо собрать его в множество (убрать повторы),
удалить все чётные элементы множества.