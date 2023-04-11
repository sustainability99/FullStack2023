import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Считаем машины в нашем автосервисе!");
        System.out.println("Задайте VIN нами обслужанных машын:");
        Scanner userInput = new Scanner(System.in);

        String VIN_code = "";
        char userChoice;

        HashSet<String> CarCode = new HashSet<String>();

        do {
            System.out.println("Введите VIN Код машины: ");
            VIN_code = userInput.next();
            CarCode.add(VIN_code);


            System.out.println("Для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

        System.out.println("В нашем автосервисе обработанные машины: ");
        System.out.println(CarCode);
        System.out.println();

        for (String st : CarCode) {
            System.out.println(st);
        }

        System.out.println();

        do {
            System.out.println("Проверка, проходила эта машина нашу обработку?");
            System.out.println("Введите VIN Код машины: ");
            VIN_code = userInput.next();
            if (CarCode.contains(VIN_code)) {
                System.out.println("Да, такой VIN Кода машины уже есть.");
            } else {
                System.out.println("Нет, такого VIN Кода машины еще нет.");
            };

            System.out.println("Для для остановки проверки нажмите s, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

    }
}

