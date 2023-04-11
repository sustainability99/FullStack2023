import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Гирлянда на 32 лампочки");
        // Гирлянда из 32 "лампочек".
        // Реализуйте метод "blink", который будет мигать лампочками гирлянды один раз;
        // Как первый шаг - будем включать выключать одну лампочку.
        // Нам понадобится "задержка по времени", это позволит управлять состоянием ламочки
        // Заведем массив ArrayList на 32 лампочки
        // ключ: номер лампочки, значение: true или falls
        // метод blink получает на вход - массив лампочек и номер лампочки, которую он должен
        // зажечь или погасить
        // возвращаем массив в новом состоянии

        ArrayList<Integer> garland = new ArrayList<>();

        // заполняем гирлянду включенными лампочками
        for ( int i = 0 ; i < 32 ; i++) {
            // int e = (int)(( Math.random() * 2));
            garland.add( i, 1);
        }

        garland_print_out(garland);// напечатали гирлянду
        // задержка на 1 сек
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print('\r'); //  возврат на начало строки (гирлянды)
        garland_set_nul(garland); // погасили все лампочки в гирлянде
        garland_print_out(garland); // напечатали гирлянду
        System.out.print('\r'); //  возврат на начало строки (гирлянды)
        // цикл "бегущая единица"
        for (int i = 0; i < garland.size() ; i++) {
            garland_on_n(garland, i); // включили i-ю лампочку
            Thread.sleep(300); // задержка
            garland_print_out(garland); // напечатали гирлянду
            System.out.print('\r'); //  возврат каретки
            garland_set_nul(garland); // погасили гирлянду
        }

        Thread.sleep(300); // задержка

        // garland_off_n(garland, garland.size() - 1 ); // погасили последнюю лампочку в гирлянде
        garland_set_nul(garland); // погасили гирлянду
        garland_print_out(garland); // напечатали гирлянду
    }

    // метод blink получает на вход гирлянду + номер "лампочки" и меняет ее состояние этой лампочки
    public static void blink(ArrayList<Integer> array, int n) {
        if (array.get(n) == 0) {
            array.set(n, 1);
        } else {
            array.set(n,0);
        }
    }

    // Метод garland_set_nul обнуляет (гасит) все лампочки гирлянды
    public static void garland_set_nul (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, 0);
        }
    }
    // Метод garland_print_out выводит на печать гирлянду
    public static void garland_print_out (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " | ");
        }
    }

    // Метод garland_on_n включает лампочку с номером n
    public static void garland_on_n(ArrayList<Integer> array, int n) {
        array.set(n, 1);
    }

    // Метод garland_off_n выключает лампочку с номером n
    public static void garland_off_n(ArrayList<Integer> array, int n) {
        array.set(n, 0);
    }

}


/*
        // мигнули каждой лампочкой гирлянды
        for (int i = 0 ; i < garland.size(); i++) {
            blink(garland, i); // вызов метода blink, передаем гирлянду и номер лампочки, которой надо мигнуть
        }
        // задержка на 1 сек
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println('\r'); //  возврат каретки

 */