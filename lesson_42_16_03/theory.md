### 1. Модификаторы доступа public и private
В Java используются следующие модификаторы доступа:

**public:** публичный, общедоступный класс или член класса. Поля и методы,
объявленные с модификатором public, видны другим классам из текущего пакета и из внешних пакетов.
Пакет = директория, в которой лежат файлы с классами (обычно).

**private:** закрытый класс или член класса, противоположность модификатору public.
Закрытый класс или член класса доступен только из кода в том же классе.

**protected:** такой класс или член класса доступен из любого места в текущем классе или
пакете или в производных классах, даже если они находятся в других пакетах.

**Модификатор по умолчанию.** Отсутствие модификатора у поля или метода класса предполагает
применение к нему модификатора по умолчанию. Такие поля или методы видны всем классам в текущем пакете,
но не виден в другом пакете.


### 2. Статичные методы и атрибуты (static) -
https://vertex-academy.com/tutorials/ru/modifikator-static-v-java-metody/

https://javarush.com/groups/posts/modifikator-static-java

https://topjava.ru/blog/rukovodstvo-po-modifikatoru-static-v-java


### 3. Метод equals() для сравнения объектов
Сравнение объектов по умолчанию сравнивает ссылки на них, НО не содержимое полей объектов.
Если вы создали собственный класс (например, деньги) и хотите научиться сравнивать его с другими объектами,
то вам необходимо переопределить метод public boolean equals(Object o):

Пример:
public class Money {

private long amount;
private String currency;

public Money(double amount, String currency) {
this.amount = Math.round(amount * 100);
this.currency = currency;
}

@Override
public String toString() {
return String.format("%.2f %s", amount / 100.0, currency.toUpperCase());
}

@Override
public boolean equals(Object other) {
if (this == other) {
return true;
}
if (!(other instanceof Money money)) {
return false;
}
return amount == money.amount && currency.equalsIgnoreString(money.currency);
}
}

Внимание! Метод equals должен принимать аргумент Object!
При сравнении вам нужно самостоятельно проверить, можете ли вы сравнивать с экземплярами конкретного класса!

### 4. Метод hashCode()
Метод public int hashCode() используется Java при поиске и хранении объекта
при использовании в качестве элемента множества или ключа словаря (Map).

Необходимо, чтобы для тех объектов, которые считает равными equals(), метод hashCode()
также возвращал одинаковое значение.

Поэтому при переопределении метода equals() необходимо (целесообразно) переопределить метод hashCode().
Желательно, чтобы для разных объектов метод hashCode() возвращал разные значения,
иначе скорость работы HashMap и HashSet сильно замедлится.

Пример "грубой" реализации метода, консистентной с equals(), для упомянутого выше класса Money:
@Override
public int hashCode() {
return (int) amount * currency.hashCode();
}

Пример усовершенствованной реализации, генерируемой Idea для старых версий Java:

@Override
public int hashCode() {
int result = (int) (amount ^ (amount >>> 32));
result = 31 * result + currency.hashCode();
return result;
}
Idea по запросу автоматически генерирует методы equals() и hashCode():

@Override
public boolean equals(Object o) {
if (this == o) {
return true;
}
if (!(o instanceof Money money)) {
return false;
}
return amount == money.amount && currency.equals(money.currency);
}

@Override
public int hashCode() {
return Objects.hash(amount, currency);
}
В большинстве случаев результат автоматической генерации вам полностью подойдёт.