import java.util.Comparator;
public class SortbyID implements Comparator<Employee>{
    //Damit die Classe funktioniert müssen wir die die Methode compare implimintieren,
    // dieser vergleicht die Objekte (O1 o1, O2 o2)

    public int compare (Employee a, Employee b){ //kann man auch einfach ***compareTo*** schreiben
        return a.empID - b.empID; // Vergleich Nummer mathematisch
        // unter Bedingung, dass die Nummer der Mitarbeiter werden fortlaufend vergeben.

    }

}
