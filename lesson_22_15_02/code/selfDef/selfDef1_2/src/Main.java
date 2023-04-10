import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /*Задача 1
    Создать список из своей профессиональной области. Выполнить с ним все действия,
    как на уроке. Придумать, спросить о каких-то еще возможных операциях с листом.
     */

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Ich mache eine Liste der 3 Säulen der Nachhaltigkeit
        ArrayList<String> sustainability = new ArrayList<String>();

        sustainability.add("Ecology");
        sustainability.add("Economy");
        sustainability.add("Social");

        System.out.println(sustainability); // Gesamte Liste ausgeben - [Ecology, Economy, Social]

        int size = sustainability.size(); // wie groß ist die Liste
        System.out.println("Größe der Nachhaltigkeitsliste: " + size);

        int index = sustainability.indexOf("Economy");
        System.out.println("Nummer " + "Economy" + " in der Liste " + index);
        // lesen den Index von Economy in der Liste

        sustainability.remove(0); // entfernen index 0 aus der Liste
        System.out.println(sustainability); // ausgeben nach der Entfernung index o

        boolean BrandPresents = sustainability.contains("Ecology");
        System.out.println(BrandPresents);
        // kontrolle ob Ecology in der Liste auftaucht

        // Kontrolle - beinhaltet die Liste **Social** ?
        // wenn false dann hinzufügen
        if (sustainability.contains("Social") == false) {
            sustainability.add("Social");
        }
        System.out.println(sustainability);

        // Kontrolle - beinhaltet die Liste ** Drei Säulen** ?
        // wenn false dann hinzufügen

        if (sustainability.contains("Drei Säulen") == false) {
            sustainability.add("Drei Säulen");
        }

        System.out.println(sustainability); // [Economy, Social, Drei Säulen]

        // neue Ausgabe der Liste mit index
        for (int i=0; i < sustainability.size(); i++) {
            System.out.print(i + " " + sustainability.get(i)+"  |  ");
        }

        System.out.println("\n"); // macht leere Linie nur mit dem Kürzel \n

        // die Liste wird sortiert nach Buchstaben
        Collections.sort(sustainability); // der Sortieralgorithmus wird gestartet

        for (int i=0; i < sustainability.size(); i++) {
            System.out.println(i + " " + sustainability.get(i));
        }

    }
}

