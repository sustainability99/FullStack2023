public class Main {
    public static void main(String[] args) {
        //- Задача об Избирателе, ему болжно быть более 16 лет.

        System.out.println("Kontrolle des Alters eines Wählers ");

        Voter v1 = new Voter("123456789", 15, "Willy");// Constructor aufrufen für das Objekt in der Klasse
        System.out.println(v1);
        System.out.println();

        Voter v2 = new Voter("987654321", 35, "John");// Constructor aufrufen für das Objekt in der Klasse
        System.out.println(v2);

        Voter v3 = new Voter("987654321", 35,"");// Constructor aufrufen für das Objekt in der Klasse
        System.out.println(v3);


    }
}