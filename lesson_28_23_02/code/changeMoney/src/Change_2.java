/*
****************************************************Задача*********************************************************
        Разработать конвертер валют который будет позволять пользователю
        конвертировать сумму из одной валюты в другую.
        ********************* Функциональные требования ******************************
        * Пользователь может выбрать исходную валюту из предопределенного списка валют,
        содержащего USD, EUR, GBP, CAD, HKD.
        * Пользователь может выбрать целевую валюту из того же списка.
        * Пользователь может ввести сумму для конвертации.
        * Система должна отображать результат конвертации в выбранную целевую валюту.
        * Все вводимые данные должны быть проверены на корректность.
        ********************* Нефункциональные требования *****************************
        * Конвертер должен быть легко расширяемым. В будущем должна быть возможность добавления
        новых валют в список доступных для конвертации.
        * Конвертер должен быть прост в использовании и иметь простой пользовательский интерфейс.
        ********************* Описание процесса работы ********************************
        * Пользователь запускает конвертер.                                     // scanner
        * Система отображает список доступных валют для конвертации.             // scanner+hashMap
        * Пользователь выбирает исходную валюту из списка.                      // scaner
        * Система запрашивает у пользователя целевую валюту для конвертации.    // scaner-sout
        * Пользователь выбирает целевую валюту из списка.                      // scaner
        * Система запрашивает у пользователя сумму для конвертации.
        * Пользователь вводит сумму для конвертации.
        * Защита от некоректоного ввода и кода валюты и суммы                   // try catch
        * Система выполняет конвертацию и отображает результат в выбранной целевой валюте.  //for
        * Пользователь может повторить процесс конвертации или завершить работу с конвертером.
        ********************** Тестирование *******************************************
        Для проверки корректной работы конвертера следует провести следующие тесты:
        * Проверить корректность работы конвертера при выборе разных валют для конвертации.
        * Проверить корректность работы конвертера при вводе разных сумм для конвертации.
        * Проверить корректность работы конвертера при добавлении новых валют в список доступных для конвертации.
        * Проверить корректность работы конвертера при вводе некорректных данных (например, отрицательной суммы или неверного кода
        13:39
*/

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Change_2 {
    public static void main(String[] args) {

        while (true) {

            Map<String, Double> exchangeRates = new HashMap<>();

            exchangeRates.put("USD", 1.0);
            exchangeRates.put("EUR", 0.94);
            exchangeRates.put("GBP", 0.82);
            exchangeRates.put("CAD", 1.34);
            exchangeRates.put("HKD", 7.84);

            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Привествую вас в конвертере валют. Вы можете использовать следующие валюты: \n");
                for (String currency : exchangeRates.keySet()) {
                    System.out.println(" " + currency);
                }
                System.out.println("Выберите валюту, которую нужно конвертировать: ");
                String baseCurrency = scanner.nextLine().toUpperCase();
                while (!exchangeRates.containsKey(baseCurrency)) {
                    System.out.println("Такой валюты не существует, попробуйте еще раз: ");
                    baseCurrency = scanner.nextLine().toUpperCase();
                }

                System.out.println("В какую валюту вы хотите конвертировать: ");
                String targetCurrency = scanner.nextLine().toUpperCase();

                while (!exchangeRates.containsKey(targetCurrency)) {
                    System.out.println("Такой валюты не существует, попробуйте еще раз: ");
                    targetCurrency = scanner.nextLine().toUpperCase();
                }

                System.out.println("Введите сумму: ");
                double sumCurrency = scanner.nextInt();
                while (sumCurrency <= 0) {
                    System.out.println("Неправильное число, попробуйте еще раз");
                    System.out.println("Введите сумму: ");
                    sumCurrency = scanner.nextInt();
                }

                double baseRate = exchangeRates.get(baseCurrency);
                double targetRate = exchangeRates.get(targetCurrency);

                double result = (sumCurrency * targetRate) / baseRate;

                System.out.println(sumCurrency + " " + baseCurrency + " = " + result + " " + targetCurrency);

                System.out.println("Хотите продолжить? y/n");
                char choice = scanner.next().toLowerCase().charAt(0);
                if (choice == 'n') {
                    System.out.println("Хорошего дня!");
                    break;
                }

            } catch (NullPointerException ex) {
                System.out.println("Где-то вы ошиблись, попробуйте заново!");
                scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Где-то вы ошиблись, попробуйте заново!");
                scanner.nextLine();

            } catch (NumberFormatException ex) {
                System.out.println("Где-то вы ошиблись, попробуйте заново!");
                scanner.nextLine();

            }
        }
    }
}