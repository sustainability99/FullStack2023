import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sie haben eine andere Währung als Euro, wir könnne Ihnen helfen sie ");

        enum waerung {

            Dollar,
            Rupie,
            SingapurDollar,
            Peso,
            Yen,

        }

        for (waerung meineWahl : waerung.values()) {
            System.out.println(meineWahl);
        }
        System.out.println("Wählen Sie die gewünschte Währung aus, die wir umrechnen sollen.");
        System.out.println("Wählen 1 für Dollar\n"+" 2 für Rupie\n"+" 3 für Singapur Dollar\n"+" 4 für Peso\n"+" und 5 für Yen:\n");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        double wechsel = 0;


        waerung meineWahl = waerung.Yen;


        switch (choise){
            case 1: {
                meineWahl = waerung.Dollar;
                break;
            }
            case 2: {
                meineWahl = waerung.Rupie;
                break;
            }
            case 3: {
                meineWahl = waerung.SingapurDollar;
                break;
            }
            case 4: {
                meineWahl = waerung.Yen;
                break;
            }
        }

        switch (meineWahl) {
            case Dollar -> {
                wechsel = 1.06;
                System.out.println(wechsel + " Dollar kostet  1 Euro");

                break;
            }case Rupie -> {
                wechsel = 87.79;
                System.out.println(wechsel + " Rupie kostet  1 Euro");
                break;

            }case SingapurDollar -> {
                wechsel = 1.43;
                System.out.println(wechsel + " Singapur Dollar kostet  1 Euro");
                break;

            }case Peso -> {
                wechsel = 19.33;
                System.out.println(wechsel + " Peso kostet  1 Euro");
                break;
            }case Yen -> {
                wechsel = 145.07;
                System.out.println( wechsel + " Yen kostet  1 Euro");
                break;
            }

        }
        System.out.println("Welche Summe wollen Sie wechseln?");

    }

}