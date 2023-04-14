public class Main {

    public static void main(String[] args) {


        // 1  String-Verkettung mit StringBuilder:
        //    Wörter werden nacheinadner hinzugefügt
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String result = sb.toString(); // Ergebnis: "Hello world"
        System.out.println(result);

        // 2   Einfügen von Text an einer bestimmten Position:
        StringBuilder sb2 = new StringBuilder("Hello world");
        sb.insert(5, ",");
        String result2 = sb.toString(); // Ergebnis: "Hello, world"
        System.out.println(result2);

        // 3   Ersetzen von Teilen einer Zeichenkette:
        StringBuilder sb3 = new StringBuilder("Hello world");
        sb.replace(7, 13, "there");
        String result3 = sb.toString(); // Ergebnis: "Hello, there"
        System.out.println(result3);

        // 4    Löschen von Teilen einer Zeichenkette:

        StringBuilder sb4 = new StringBuilder("Hello world");
        sb.delete(5, 11);
        String result4 = sb.toString(); // Ergebnis: "Hellold"
        System.out.println(result4);
    }
}

