***Лямбда выражения***

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. 
Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно 
вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет 
лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет 
тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в 
функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один 
единственный метод без реализации.