public class Telefon implements Comparable<Telefon>{

    String name;
    int price;
    int capacity;

    public Telefon(String name, int price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\n Telefon { " +
                " name = '" + name + '\'' +
                ", price = " + price +
                ", capacity = " + capacity +
                '}';
    }

    @Override
    public int compareTo(Telefon o) {
        if (this.capacity == o.capacity){
            return 0;
        } else if (this.capacity < o.capacity) {
            return -1;
        } else {
            return 1;
        }

    }
}
