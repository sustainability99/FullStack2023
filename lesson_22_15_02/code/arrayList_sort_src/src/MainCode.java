import java.util.ArrayList;
public class MainCode {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Liste Automobilmarken
        ArrayList<String> brandList = new ArrayList<String>();

        brandList.add("BMW");
        brandList.add("Mercedes");
        brandList.add("VW");
        brandList.add("Ford");
        brandList.add("Fiat");
        brandList.add("Opel");

        System.out.println(brandList); // einfache Ausgabe der Liste

        int size = brandList.size(); // Größe der Kollektion/Liste erfahren
        System.out.println("Größe der Liste:  " + size);

        int index = brandList.indexOf("Fiat");
        System.out.println("Listennummer von" + " Fiat " + "ist " + index);

        brandList.remove(4); // entfernen Nummer 4 aus der Liste
        System.out.println(brandList); // Ausgabe nach der Entfernung der Nummer

        boolean BrandPresent = brandList.contains("Opel"); //untersuchen ob Opel aufgelistet ist
        System.out.println(BrandPresent);

        //brand in die Liste aufnehmen, wenn es nicht ausgelistet ist
        if (brandList.contains("Opel") == false) {

        }
    }
}

