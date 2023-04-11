import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Erstelle ein HashSet
        HashSet<String> set = new HashSet<String>();

        // Füge Elemente zum HashSet hinzu
        set.add("Apfel");
        set.add("Banane");
        set.add("Kirsche");
        set.add("Dattel");

        // Addierte Elemente ins HashSet
        System.out.println("Das sind Früchte im HashSet :" + set);

        // Entferne ein Element aus dem HashSet
        set.remove("Kirsche");
        System.out.println("Das sind Früchte im HashSet :" + set);

        // Überprüfe, ob ein Element im HashSet vorhanden ist
        boolean containsApple = set.contains("Apfel");
        System.out.println("Ist Apfel im HashSet vorhanden? " + containsApple);

        // Gib die Anzahl der Elemente im HashSet aus
        System.out.println("Anzahl der Elemente im HashSet: " + set.size());

        // Iteriere über alle Elemente im HashSet
        for (String element : set) {
            System.out.println(element);
        }

        // Leere das HashSet
        set.clear();
        System.out.println("Anzahl der Elemente im geleerten HashSet: " + set.size());
    }
}
