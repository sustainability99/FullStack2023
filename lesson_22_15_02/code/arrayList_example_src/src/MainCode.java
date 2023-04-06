import java.util.ArrayList;
import java.util.Collections;

public class MainCode {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        // ArrayList füllen mit zufälligen ganzen Zahlen von 1-10
        for (int i = 0; i < 10; i++) {
            myNumbers.add((int) (Math.random() * (10) + 1)); //die Formel nutzen
        }
        System.out.println(myNumbers);
        System.out.println("Länge der Liste  " + myNumbers.size());

        //hier wird die Liste sortiert und ausgegeben
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        //standartzyklus for each um die ArrayList auszugeben/drucken
        for (int i : myNumbers) {
            System.out.print(i + " | ");
        }
    }
}


// Hat gut geklappt während der Vorlesung
