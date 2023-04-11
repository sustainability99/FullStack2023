import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш ресторан!");
        // Небольшой ресторан, в котором имеется 5 столиков, хочет внедрить у себя вежливого
        // телефонного администратора (бота), который:
        // - принимает звонок от потенциального клиента;
        // - сообщает о наличии свободных стликов;
        // - при желании клиента выполняет бронирование столика.

        HashMap<Integer, Boolean> tables = new HashMap<Integer, Boolean>();

        // все столы свободны (не заняты)
        tables.put(1, false);
        tables.put(2, false);
        tables.put(3, false);
        tables.put(4, false);
        tables.put(5, false);

        Scanner sc = new Scanner(System.in);

        //do {
        System.out.println("Здравствуйте!");
        boolean is_full = false;

        // Проверка на наличие свободных столиков
        is_full = is_full(tables, 5);

        if (!is_full) {
            System.out.println("У нас есть свободные столики!");
        } else {
            System.out.println("Извините, у нас все столики заняты.");}

        print_table_status(tables); // метод печатает статус столов
        // запрос к пользователю
        System.out.println("Выберите номер столика: " );
        int table_num = sc.nextInt();
        reserv_table(tables, table_num); // метод, который резервирует стол
        print_table_status(tables);

        //} while (true);

    }

    public static void reserv_table(HashMap<Integer, Boolean> map, int num) {
        if (map.get(num).equals(false)) {
            map.put(num,true);
            System.out.println("Столик " + num + " зарезервирован." );
            return;
        } else {
            System.out.println("Столик " + num + " уже зарезервирован." );
            return;
        }
    }

    public static void print_table_status(HashMap<Integer, Boolean> map){
        for (Object i : map.keySet()) {
            String status = "";
            if (map.get(i).equals(true)) {
                status = " зарезервирован ";
            } else {status = " свободен ";
            }
            System.out.println("Столик: " + i + " статус: " + status);
        }
    }

    public static boolean is_full(HashMap<Integer, Boolean> map, int num) {
        boolean is_full = true;
        for ( int i = 1; i < 6; i++) {
            if (map.get(i) == false) {
                is_full = false;
            }
        }
        // если все столики зарезервированы, то есть все values в map == true
        return is_full;
        // иначе return false;
    }
}