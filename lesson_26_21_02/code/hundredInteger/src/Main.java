import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача на удаление повторов с помощью HashSet.");
        // Создать список из 100 целых случайных чисел в интервале от 1 до 99,
        // с помощью HashSet исключить повторы(дубликаты) и вывести на печать количество уникальных элементов
        // полученного множества.

        int[] hundred_integer = new int[100]; // инициализация массива для 100 целых чисел

        // цикл для заполнения массива случайными числами
        for ( int i = 0  ; i < hundred_integer.length ;  i++ ) {
            hundred_integer[i] = (int)(Math.random()*(99 - 1) + 1);
            System.out.print(hundred_integer[i] + " | ");
        }
        System.out.println();

        HashSet<Integer> myHashSet = new HashSet<>(); // инициализация HashSet

        // цикл для заполнения HashSet случайными числами из массива hundred_integer
        for ( int i = 0  ; i < hundred_integer.length ;  i++ ) {
            myHashSet.add(hundred_integer[i]);
        }
        int k = myHashSet.size(); // узнаем длину (размер) полученной HashSet
        System.out.println("Уникальных чисел в HashSet: " + k); // печать результата
    }
}

/*  Вариант Дины:

    HashSet<Integer> randomSet = new HashSet();

        for (int i = 1; i < 100; i ++) { // заполнение нужно начинать с 0
            randomSet.add((int) ((Math.random() * 99 + 1)));
        };

        for (int numbers : randomSet) {
            System.out.println(numbers);
        }
 */