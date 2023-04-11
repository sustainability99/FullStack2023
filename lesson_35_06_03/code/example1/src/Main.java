public class Main {
    public static void main(String[] args) {
        System.out.println("Ein Beispiel zum erzeugen eines Klasses");

        //Wir gründen ein Klasse in der Klasse
        class Car { //Namen für die Klasse bestimmt, beschrieben die wichtigen Felder (Karakteristik)

            String brand;
            String color;
            int year;
            String typ;
        }

        Car myCar = new Car();
            myCar.brand = "VW";
            myCar.color = "silver";
            myCar.typ = "universal";
            myCar.year = 2018;

        //System.out.println(myCar); // hier wird nur der Link auf die Klasse ausgegeben
        //System.out.println("Das ist die Marke des Autos   " + myCar.brand + "  Farbe " + myCar.color);
        //System.out.println("Form des Fahrzeuges " + myCar.typ + "  Herstelldatum  " + myCar.year);

        Pet myPet = new Pet();
         myPet.type = "cat";
         myPet.breed = "unknown";
         myPet.name = "Murka";
         myPet.weight = 2.4;

        System.out.println("Typ des Tieres: " + myPet.type + "  |  Die Züchtung " + myPet.breed );
        System.out.println("Name des Tieres " + myPet.name + "  | Gewicht " + myPet.weight);

        System.out.println(myPet);
        System.out.println(myPet.toString());

    }
}