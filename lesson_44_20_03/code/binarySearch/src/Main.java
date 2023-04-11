import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binare Suche in einem Massiv");
        // На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
        // массив отсортирован от меньшего к большему элементу
        // пользователь вводит интересующее его число - есть оно в массиве или нет?
        // на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
        // ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
        // продолжать,пока не будет найден искомый элемент массива или не закончится массив

        int[] array = {3, 5, 19, 22, 33, 46, 51, 64, 85, 99}; // Massiv muss erst sortiert werden
        int lenght = array.length; //Länge des Massives
        System.out.println("Länge des Massives : " + lenght); // Ausgabe auf die Console

        Scanner sc = new Scanner(System.in); // Scanner eingeschaltet für die Eingabe von der Tastatur
        System.out.println("Geben sie eine Zahl ein um den Massiv zu füllen : ");
        int element = sc.nextInt(); // lesen die eingegebene Zahl
        System.out.println("Suchen das eingegebene Element ***" + element + "*** im Massiv."); // Ausgabe

        // geben die Regeln ein
        boolean hasElement = false; // Result aus der Suche, gibt es das Element true/false

        int left = 0; // linkes Ende des Massives
        int right = lenght-1; // das ist das rechte Ende des Massives
        int middle = left + (right - left)/2; // rechnen Index der Mitte des Massives aus

        while (left<=right) { // Zyklus
            if (element < array[middle]) { // wenn das gesuchte Element sich in der linken Hälfte befindet
                right = middle - 1; //rechte Seite des Massives (Index) bewegen in die Mitte

            } else if (element > array[middle] ) { // wenn das gesuchte Element sich in der rechten Hälfte befindet
                left = middle + 1; // linke Seite des Massives (Index) bewegen in die Mitte

            } else {
                hasElement = true;
                break;
            }
            middle = left + (right - left)/2; // вычисляем новую середину
        }
        System.out.println(hasElement);

    }
}