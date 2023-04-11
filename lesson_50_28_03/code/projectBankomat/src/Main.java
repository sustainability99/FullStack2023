import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вход в систему с защитой
        // Выбор 4 категорий
        // Каталог товаров с сортировкой по рейтингу
        // Покупка товара
        // Выход из системы
        System.out.println("Мой интернет магазин одежды");
        // cоздание файла для логина и пароля
        String path = "C:\\AIR AIT\\MyProjeckt\\OnlineStore\\src\\";
        String fileLogin = "login.txt";
        String filePass = "password.txt";
        //логин
        createFile(path,fileLogin);
        String data = "user";
        Product.writeDataInFile(path,fileLogin,data);
        String d = Product.readDataFromFile(path,fileLogin);
// пароль
        createFile(path,filePass);
        String data1 = "qwerty";
        Product.writeDataInFile(path,filePass,data1);
        String d1 = Product.readDataFromFile(path,filePass);
// цыкл по которому выполняется вход
        while (true) {
            System.out.println("Введите логин:");
            String input = readClientInput();
            if (input.equals(d)) {
                System.out.println("Введите пароль:");

            } else System.out.println("Неверный логин или пароль:");


            String input1 = readClientInput();
            if (input1.equals(d1)) {
                System.out.println();
                break;
            } else
                System.out.println();
            System.out.println("Неверный логин или пароль:\"");
        }

        // меню категорий
        enum Menu {
            CATALOG,
            PURCHASE,
            BASKET,
            EXIT,

        }
        ArrayList basket = new ArrayList<>();
        ArrayList todoList = new ArrayList<>();
        while (true) {
            for (Menu myMenu : Menu.values()) { // цикл for each - Список по который перебирает параметры цикла, значения
                System.out.print(myMenu + " | "); // оператор с параметром цикла
            }
            System.out.println();
            System.out.println("Выберите действие: нажмите 1,2,3 или 4");
            int choice = readMenueChoice(); // выбор пользователь считаем в методе readMenuChoice
            Menu myMenu = Menu.CATALOG; // начальное значение выбора меню

            switch (choice) {
                case 1: {
                    myMenu = Menu.CATALOG;
                    catalog(todoList);
                    break;
                }
                case 2: {
                    myMenu = Menu.PURCHASE;
                    purchase(todoList);
                    add_basket(todoList,basket);
                    System.out.println();
                    break;
                }

                case 3: {
                    myMenu = Menu.BASKET;
                    System.out.println("Ваша корзина:" + " " + data);
                    print_basket(basket);
                    System.out.println();
                    break;

                }
                case 4: {
                    myMenu = Menu.EXIT;
                    System.out.println("Спасибо за покупку, до свидания!");
                    return;
                }
                default: {
                    System.out.println("Введите число 1, 2, 3 или 4");
                }


            }
        }


    }
    // метод для категории товаров с сортировкой
    public static void catalog(ArrayList catalog) {
        System.out.println("Каталог товаров");
        Product t1 = new Product("Vans forever", "Black", 32.00, 8);
        Product t2 = new Product("Nike Sport", "Blue", 34.56, 9);
        Product t3 = new Product("Calvin Klein", "Brown", 50.00, 7);
        Product t4 = new Product("Adidas Originals", "White", 49.87, 6);
        ArrayList tShirts = new ArrayList<>();
        tShirts.add(t1);
        tShirts.add(t2);
        tShirts.add(t3);
        tShirts.add(t4);

        Product h1 = new Product("Dickies aitkin", "White", 60.00, 9);
        Product h2 = new Product("Nike hoodie", "Midnight Navy", 64.00, 7);
        Product h3 = new Product("Levi's", "Black", 55.00, 10);
        Product h4 = new Product("Carhartt", "Green", 95.00, 9);
        ArrayList hoodies = new ArrayList<>();
        hoodies.add(h1);
        hoodies.add(h2);
        hoodies.add(h3);
        hoodies.add(h4);

        Product j1 = new Product("Levi's", "Jeans", 95.00, 7);
        Product j2 = new Product("Bershka", "Jeans", 35.00, 8);
        Product j3 = new Product("Calvin Klein", "Jeans", 90.00, 10);
        Product j4 = new Product("Carhartt", "Jeans", 100.00, 9);
        ArrayList jeans = new ArrayList<>();
        jeans.add(j1);
        jeans.add(j2);
        jeans.add(j3);
        jeans.add(j4);
        System.out.println();
        System.out.println("Футболки:");
        Collections.sort(tShirts, new Raiting()); // сортировка по рейтингу
        for (int i = 0; i < tShirts.size(); i++) {
            System.out.println(tShirts.get(i));
        }
        System.out.println();
        System.out.println("Худи:");

        Collections.sort(hoodies, new Raiting());
        for (int i = 0; i < hoodies.size(); i++) {
            System.out.println(hoodies.get(i));
        }
        System.out.println();

        System.out.println("Штаны:");

        Collections.sort(jeans, new Raiting());
        for (int i = 0; i < jeans.size(); i++) {
            System.out.println(jeans.get(i));
        }
        System.out.println();


    }

    // метод для покупки товаров
    private static void purchase(ArrayList purchase) {
// масив который печатает все товары
        Product t1 = new Product("Vans forever", "Black", 32.00, 8);
        Product t2 = new Product("Nike Sport", "Blue", 34.56, 9);
        Product t3 = new Product("Calvin Klein", "Brown", 50.00, 7);
        Product t4 = new Product("Adidas Originals", "White", 49.87, 6);


        Product t5 = new Product("Dickies aitkin", "White", 60.00, 9);
        Product t6 = new Product("Nike hoodie", "Midnight Navy", 64.00, 7);
        Product t7 = new Product("Levi's", "Black", 55.00, 10);
        Product t8 = new Product("Carhartt", "Green", 95.00, 9);


        Product t9 = new Product("Levi's", "Jeans", 95.00, 7);
        Product t10 = new Product("Bershka", "Jeans", 35.00, 8);
        Product t11 = new Product("Calvin Klein", "Jeans", 90.00, 10);
        Product t12 = new Product("Carhartt", "Jeans", 100.00, 9);
        ArrayList purchase1 = new ArrayList<>();
        purchase1.add(t1);
        purchase1.add(t2);
        purchase1.add(t3);
        purchase1.add(t4);
        purchase1.add(t5);
        purchase1.add(t6);
        purchase1.add(t7);
        purchase1.add(t8);
        purchase1.add(t9);
        purchase1.add(t10);
        purchase1.add(t11);
        purchase1.add(t12);
        for (int i = 0; i < purchase1.size(); i++) {
            int n = i + 1;
            System.out.println(n + ". " + purchase1.get(i));
        }
        // метод из которого берутся товары и попадают в корзину
        Product a1 = new Product("Vans forever", "Black", 32.00, 8);
        Product a2 = new Product("Nike Sport", "Blue", 34.56, 9);
        Product a3 = new Product("Calvin Klein", "Brown", 50.00, 7);
        Product a4 = new Product("Adidas Originals", "White", 49.87, 6);


        Product a5 = new Product("Dickies aitkin", "White", 60.00, 9);
        Product a6 = new Product("Nike hoodie", "Midnight Navy", 64.00, 7);
        Product a7 = new Product("Levi's", "Black", 55.00, 10);
        Product a8 = new Product("Carhartt", "Green", 95.00, 9);


        Product a9 = new Product("Levi's", "Jeans", 95.00, 7);
        Product a10 = new Product("Bershka", "Jeans", 35.00, 8);
        Product a11 = new Product("Calvin Klein", "Jeans", 90.00, 10);
        Product a12 = new Product("Carhartt", "Jeans", 100.00, 9);

        purchase.add(a1);
        purchase.add(a2);
        purchase.add(a3);
        purchase.add(a4);
        purchase.add(a5);
        purchase.add(a6);
        purchase.add(a7);
        purchase.add(a8);
        purchase.add(a9);
        purchase.add(a10);
        purchase.add(a11);
        purchase.add(a12);
        for (int i = 0; i < purchase.size(); i++) {
            int n = i + 1;
        }
    }


    private static int readMenueChoice() {
        Scanner sc = new Scanner(System.in);
        int menuChoice = 0;
        try {
            menuChoice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("нужно вводить числа, а не символы.");

        }
        return menuChoice;
    }
    // выбор товара по индексу
    public static void add_basket(ArrayList purchase, ArrayList basket) {
        System.out.println("Выбере номер товара для покупки");
        Scanner sc = new Scanner(System.in);
        int basket_num = sc.nextInt();
        if (basket_num >= 1 && basket_num <= purchase.size()) {
            int n = basket_num - 1; // индекс задачт на 1 меньше чем ее номер на экране
            basket.add(purchase.get(n));
        }
    }


    // печать корзины
    public static void print_basket(ArrayList basket) {
        for (int i = 0; i < basket.size(); i++) {
            System.out.println(basket.get(i)); // печатаем задачу
        }if (basket.size() == 0) {
            System.out.println("Задач еще нет, начните их добавлять ");
        }
    }
    private static void createFile(String path, String fileName) {
    }
    public static String readClientInput() {
        Scanner sc = new Scanner(System.in);
        String clientInput=" ";

        clientInput = sc.nextLine();

        return clientInput;
    }
}
