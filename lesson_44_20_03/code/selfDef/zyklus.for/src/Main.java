import java.util.Scanner;

public class Main {
    /*Задача 2. Задача на повторение темы массивы и цикл for. Заполните массив из 20 элементов
    случайными числами в интервале от 1 до 50. Необходимо понять, имеется ли вводимое
    пользователем число в массиве. Если число есть, то выводится так же его индекс*/
    public static void main(String[] args) {
        System.out.println("Wiederholungsaufgabe über Zyklus for");

        int[] twentyElements = new int[20];

        for (int j = 0; j < 50; j++) {
            int result = (int) (Math.random() * (50 - 1 + 1) + 1);
            System.out.println(result);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein : ");
        int number = sc.nextInt();


        for (int i = 0; i < twentyElements.length; i++) {
            if (twentyElements.equals(number)) {
                System.out.println("Diese Nummer ist in der Liste schon enthalten!");
            }

        }
    }
}