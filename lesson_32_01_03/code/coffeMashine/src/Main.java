import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Herzlich willkommen in unserer Coffee Stube");

        enum CoffeeTyp {

            ESPRESSO,
            AMERICANO,
            CAPUCCINO,
            LATTE,
        }

        for (CoffeeTyp myCoffee : CoffeeTyp.values()) {
            System.out.println(myCoffee);
        }
        System.out.println("Wählen Sie die gewünschte Sorte des Caffees, drücken Sie 1, 2, 3 oder 4");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        int coffeePrice = 0;


        CoffeeTyp myCoffee = CoffeeTyp.ESPRESSO;


        switch (choise){
            case 1: {
                myCoffee = CoffeeTyp.ESPRESSO;
                break;
            }
            case 2: {
                myCoffee = CoffeeTyp.AMERICANO;
                break;
            }
            case 3: {
                myCoffee = CoffeeTyp.CAPUCCINO;
                break;
            }
            case 4: {
                myCoffee = CoffeeTyp.LATTE;
                break;
            }
        }

        switch (myCoffee) {
            case AMERICANO -> {
                coffeePrice = 3;
                System.out.println("Kostet " + coffeePrice + "Euro");

                break;
            }case ESPRESSO -> {
                coffeePrice = 3;
                System.out.println("Kostet " + coffeePrice + "Euro");
                break;

            }case LATTE -> {
                coffeePrice = 5;
                System.out.println("Kostet " + coffeePrice + "Euro");
                break;

            }case CAPUCCINO -> {
                coffeePrice = 4;
                System.out.println("Kostet " + coffeePrice + "Euro");
                break;
            }

        }
        System.out.println("Bezahlen Sie : " + myCoffee + "Euro");
        System.out.println("Gehen Sie zum bezahelen.");

    }

}