public class Money {
    private long amount; // переменная типа long - это целые числа
    private String currency; // название валюты - USD, EUR, ...

    // конструктор модифицированный
    public Money(double amount, String currency) { // переопределили тип переменной
        this.amount = Math.round(amount * 100); // round - это округление и умножение на 100, т.е. считаем деньги сотнями
        this.currency = currency;
    }

    // переопределяение метода toString
    @Override
    public String toString() { // это сигнатура метода, доступный, возвращает строку
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase()); // вывод кол-ва денег и названия валюты
    }
    // переопределяение метода equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {       // если объект obj является экземпляром класса Human
            return false;
        }
        Money that = (Money) obj;
        return this.amount == that.amount && this.currency.equalsIgnoreCase(that.currency);
    }
}

//    public boolean equals(Object other) {
//    if (this == other) { // если этот элемент объект (класс?) равет другому объекту (передаваемомоу) класса
//        return true;
//    }
//    if (!(other instanceof Money money)) { // такая валюта уже есть в объектах этого класса
//        return false; // если такой валюты нет, то возвращаем false
//    }
//
//
//    return amount == money.amount && currency.equalsIgnoreCase(money.currency); // если количество денег совпадает
//                                                                                // и название валюты совпадает,
//                                                                                // то true
//    }


//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || this.getClass() != obj.getClass()) {       // если объект obj является экземпляром класса Human
//            return false;
//        }
//        Money that = (Money) obj;
//        return amount == money.amount && currency.equalsIgnoreCase(money.currency);
//    }