public class Product {
    String name;
    double price;
    int rating;

    //Constructor für Klasse Product
    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    // hier wird die Meithode toString überarbeitet (gibt die Felder auf der Console aus)
    @Override
    public String toString() {
        return "Product " +
                " name = '" + name + '\'' +
                ", price = " + price +
                ", rating = " + rating +
                '}';
    }

    // bearbeiten Methode zum Vergleichen der Objekte in der Klasse Product
    // Vergleichen zwei Felder Name und Preis
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(product.price, price) != 0) return false;
        if (rating != product.rating) return false;
        return name.equals(product.name);
    }

    //bearbeiten Methode hashCode // Ersatzmethode zum vergleichen von Produkten
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
