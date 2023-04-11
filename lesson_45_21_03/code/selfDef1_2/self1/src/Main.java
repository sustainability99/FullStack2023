import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleich von Handys.");

        Telefon t1 = new Telefon("Nokia", 500, 256);
        Telefon t2 = new Telefon("Oppo", 550, 128);
        Telefon t3 = new Telefon("Samsung", 600, 64);
        Telefon t4 = new Telefon("Philips", 700, 16);
        Telefon t5 = new Telefon("Sony", 350, 8);
        Telefon t6 = new Telefon("Apple", 150, 512);

        TreeSet telefonList = new TreeSet<>();

        telefonList.add(t1);
        telefonList.add(t2);
        telefonList.add(t3);
        telefonList.add(t4);
        telefonList.add(t5);
        telefonList.add(t6);

        System.out.println("Unsere Handys. ");
        System.out.println(telefonList);



    }
}