import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Задача 2
        Создать список из 100 целых случайных чисел в интервале от 1 до 99,
        с помощью HashSet исключить повторы(дубликаты) и вывести на печать
        количество уникальных элементов полученного множества.
        */

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 99; i++) {
            myNumbers.add((int) ((Math.random()*(99 - 1 + 1) + 1)));
        }
        System.out.println(myNumbers);
        System.out.println("Длина чисел: " + myNumbers.size());

        HashSet<Integer> meine99Zahlen = new HashSet<Integer>();

        for ( int i = 0  ; i < myNumbers.size() ; i++ ) {
            meine99Zahlen.add(myNumbers.get(i));
        }
        int Zahl = meine99Zahlen.size();
        System.out.println("Количество моих уникальных чисел от 1 до 99  : " + Zahl);
    }

}