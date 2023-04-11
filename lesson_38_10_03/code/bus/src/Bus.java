public class Bus {
    int busLine; //Nummer der Rute
    String driver; //Name des Fahrers
    int capacity; //Kapazität des Busses
    int speed; // Geschwindigkeit des Busses
    int price; // Kosten für die Fahrt

    public Bus(int busLine, String driver, int capacity, int speed, int price) {
        this.busLine = busLine;
        this.driver = driver;
        this.capacity = 36;
        if (speed <= 60) {
            this.speed = speed;
        }else {
            System.out.println("Bus fährt schneller als 60km/h, das ist gefährlich. ");
        }
        this.price = price;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}








/*- задача об автобусе:
        Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
        (не может быть больше 60 км/ч), стоимость проезда 2 евро. В классе Bus создайте метод setDriver,
        который принимает имя драйвера и назначает его водителем автобуса.
        Сформируйте информцию об автобусе в следующем виде:
        Информация об автобусе:
        Номер маршрутв : __
        Вместимость: ___ кресел
        Водитель: _____
        Скорость на маршруте: _____
        Создать класс Driver с атрибутами: имя водителя, возраст водителя (должен быть старшше 21 года и
        не старше 65 лет).
        Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
        Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
        Автобус за день совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы
        автобуса. */