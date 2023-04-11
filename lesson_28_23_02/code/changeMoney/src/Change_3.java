import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Change_3 {

    public static Scanner sc = new Scanner(System.in);
    public static HashMap<String, Double> currencyList = new HashMap<>();
    public static HashMap<Integer, String> menuCurrencyList = new HashMap<>();

    // Печатает Валюту
    public static void printCurrencyList(HashMap<String, Double> arr) {
        for (String key : arr.keySet()) {
            System.out.printf("Валюта %3s = %s%n", key, arr.get(key));
        }
    }

    // Печатает меню
    public static void printMenuCurrencyList(String str, HashMap<Integer, String> arr) {
        System.out.println(str);
        for (int key : arr.keySet()) {
            System.out.printf("%1s - %s%n", key, arr.get(key));
        }
    }

    public static void fillLists() {
        // заполнение списка валют
        currencyList.put("EUR", 1.0);
        currencyList.put("USD", 1.06);
        currencyList.put("RUB", 79.66);
        currencyList.put("UAH", 39.07);
        currencyList.put("CNY", 7.33);
        currencyList.put("GBP", 0.88);
        currencyList.put("CAD", 1.44);

        // заполнить список меню
        int index = 1;
        for (String key : currencyList.keySet()) {
            menuCurrencyList.put(index, key);
            index++;
        }
    }

    public static void printConvertResult(int amountCurrency, int currencyIndex,
                                          int convertCurrencyIndex) {
//        метод просто печатает результат конвертации
        System.out.printf(
                "Вы ввели %s %s получите: %.2f %s.%n",
                amountCurrency,
                menuCurrencyList.get(currencyIndex),
                currencyConvert(amountCurrency, currencyIndex, convertCurrencyIndex),
                menuCurrencyList.get(convertCurrencyIndex)
        );

        System.out.println("________________");
    }

    // метод для обработки и получения вводимого числа
    public static int getInputCode(String str, int maxValue) {
        int code; // код/пункт меню или вводимая сумма
        while (true) {
            try {
                // если переменная str не пустая строка выводить сообщение
                if (!Objects.equals(str, "")) {
                    System.out.print(str);
                }
                code = sc.nextInt();
                while (code < 1 || code > maxValue) { // чтоб избежать не существующих пунктов меню
                    System.out.println("Значение не может быть меньше 1 или больше " + maxValue);
                    if (!Objects.equals(str, "")) {
                        System.out.print(str);
                    }
                    code = sc.nextInt();
                }
                System.out.println("________________");
                return code;
            } catch (InputMismatchException e) { // на случай, если пользователь ввел не число
                System.out.println("Введите число !");
            }
            sc.nextLine(); // очистить сканнер
        }
    }

    public static void main(String[] args) {
        fillLists();
        printCurrencyList(currencyList);

        // получение необходимых данных
        int amountCurrency = getInputCode("Введите ссумму: ", 10000);
        printMenuCurrencyList("Укажите введенную валюту: ", menuCurrencyList);
        int currencyIndex = getInputCode("", menuCurrencyList.size());
        printMenuCurrencyList("Уажите валюту, в которую конвертируем: ", menuCurrencyList);
        int convertCurrencyIndex = getInputCode("", menuCurrencyList.size());
        printConvertResult(amountCurrency, currencyIndex, convertCurrencyIndex);

        char stopOrAgain;
        do {
            printAllConvertCurrency(amountCurrency, currencyIndex);

            System.out.print("Хотите конвертировать в другую валюту ? Введите: y/n: ");
            // на случай если пользователь захочет другую конвертировать в другую валюту
            stopOrAgain = sc.next().toLowerCase().charAt(0);
            if (stopOrAgain != 'n') {
                amountCurrency = getInputCode("Введите ссумму: ", 10000);
                printMenuCurrencyList("Укажите введенную валюту: ", menuCurrencyList);
                currencyIndex = getInputCode("", menuCurrencyList.size());
                printMenuCurrencyList("Укажите валюту, в которую конвертируем: ", menuCurrencyList);
                convertCurrencyIndex = getInputCode("", menuCurrencyList.size());
                printConvertResult(amountCurrency, currencyIndex, convertCurrencyIndex);
            }

        } while (stopOrAgain != 'n');

        System.out.println("Приходите ещё !");
    }

    public static double currencyConvert(int amountCurrency, int currencyIndex,
                                         int convertCurrencyIndex) {
        double currency = currencyList.get(menuCurrencyList.get(currencyIndex));
        double currencyConvert = currencyList.get(menuCurrencyList.get(convertCurrencyIndex));
//        метод возвращает результат конвертации принимает 3 параметра
        return amountCurrency * currencyConvert / currency;
    }

    public static void printAllConvertCurrency(int amountCurrency, int currencyIndex) {
        // метод печатает результат конвертации всех валют
        double currency = currencyList.get(menuCurrencyList.get(currencyIndex));
        double convertResult;
        System.out.println("Результаты по конвертации других валют:");
        for (String currencyItem : currencyList.keySet()) {
            convertResult = amountCurrency * currencyList.get(currencyItem) / currency;
            System.out.printf(
                    "Convert result of %s %s to %s  %.2f %n",
                    amountCurrency,
                    menuCurrencyList.get(currencyIndex),
                    currencyItem,
                    convertResult
            );

        }
    }
}