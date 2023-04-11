## Interface
**Definition:**
An interface is a completely "abstract class" that is used to group related methods
with empty bodies.

Интерфейс — это полностью «абстрактный класс», который используется для группировки/объединения
связанных (похожих) нереализованных методов (только декларация/объявление метода, а тело метода - пустое).

Интерфейс - это в общем понимании "способ взаимодействия".

**Example:**

// Interface, **объединяющий** два метода
**interface** Move {
public void moveFast(); // interface method (does not have a body)
public void moveSlow(); // interface method (does not have a body)
}

// class Vehicle "implements" the Move interface
class Vehicle **implements** Move {
public void moveFast() {
// The body of moveFast() is provided here
System.out.println("Fast speed... - вжик и нету");
}
public void sleep() {
// The body of moveSlow() is provided here
System.out.println("Slow speed... - ползем, как черепаха");
}
}

class Main {
public static void main(String[] args) {
Vehicle myVehicle = new Vehicle();  // Create a Vehicle object
myVehicl.moveFast(); // вызов одного метода
myVehicl.moveSlow(); // вызов другого метода
}
}

**Кроме того, класс в Java может использовать НЕСКОЛЬКО интерфейсов!**
Пример: BankCard и два интерфейса - Debit, Credit

## Object
Object - это стандартный класс Java. Является "супер-классом", от которого автоматически наследуется любой класс в Java.
Зачем нужен этот класс? - он содержит поведение и состояние, которое необходимо для всех классов в Java.

Класс Object в Java содержит в том числе методы equals, toString, hashCode, getClass,
которые полезны сами по себе, но и могут быть переопределены в дочерних классах.

**Что делают эти методы?**
**equals** - сравнивает объекты и делает это не всегда правильно и корректно, так как сравнивает ссылки,
а не содержимое полей объектов.

**toString** - выводит все поля обЪекта в одну строку, если вид не утраивает, то его можно переопределить.

Метод **hashCode** позволяет задать некоторое числовое значение, которое будет соответствовать данному объекту
По данному числу, например, можно сравнивать объекты. Но... можно задать свой алгоритм определения
хэш-кода объекта.
Person tom = new Person("Tom");
System.out.println(tom.hashCode()); // 2036368507

Метод **getClass** позволяет получить тип объекта:
`Person tom = new Person("Tom");
System.out.println(tom.getClass()); // class Person`

Давайте послушаем лекцию одного продвинутого преподователя про Object
и затем обсудим, что мы из нее поняли.
https://www.youtube.com/watch?v=FcKmgtMPvY0

Нужно научиться переопределять метод equql в дочерних классах, добавить сравнение по полям.