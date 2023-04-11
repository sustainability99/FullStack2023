import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beispiel für ThreeSet.");

        TreeSet ts = new TreeSet(); // schaffen neues Element der Klasse ThreeSet

        // fürgen Elemente der Klasse TreeSet hinzu
        ts.add("A");
        ts.add("A"); // Duplikate werden nicht wiederholt, Set lässt es nicht zu
        ts.add("a"); // kleine a
        ts.add("aaa"); // drei aaa
        ts.add("a a a"); // drei a a a mit Leerzeichen
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("D"); // Duplikate werden nicht wiederholt, Set lässt es nicht zu
        ts.add("E");
        ts.add("F");
        ts.add("F"); // Duplikate werden nicht wiederholt, Set lässt es nicht zu
        ts.add("G");
        ts.add("H");
        ts.add("Ekaterina");
        ts.add("10");

        System.out.println("Ein Beispiel mit String");
        // ausgeben ts.
        System.out.println(ts);
        // [10, A, B, C, D, E, Ekaterina, F, G, H, a, a a a, aaa]

        TreeSet numTs = new TreeSet();

        numTs.add(1);
        numTs.add(2);
        numTs.add(3);
        numTs.add(4);
        numTs.add(4); // Duplikate werden nicht wiederholt, Set lässt es nicht zu
        numTs.add(5);
        numTs.add(19);
        numTs.add(20);
        numTs.add(15);
        numTs.add(13);

        System.out.println("Ein Beispiel mit Zahlen also int");
        System.out.println(numTs);  //[1, 2, 3, 4, 5, 13, 15, 19, 20]


    }
}