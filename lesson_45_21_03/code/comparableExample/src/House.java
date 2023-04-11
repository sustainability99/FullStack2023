public class House implements Comparable<House> {
    // somit können wir vergleichen und sortieren Objekte unserer Klasse

    int area; // Fläche
    int price; // Preis
    String city; // Stadt

    // Bauen einen Constructor der Klasse *** House ***
    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }

    // Ausgabe der Date *** toString *** alles mit cmd + n

    @Override
    public String toString() {
        return "House | " +
                " area = " + area +
                ", price = " + price +
                ", city = '" + city + '|' +
                '\n';
    }

    @Override
    public int compareTo(House anoterHouse) { //Signatur der Methode
        if (this.price == anoterHouse.price) {
            return 0;
        } else if (this.price <anoterHouse.price){
            return -1;
        } else {
            return 1;
        }
    }
}
