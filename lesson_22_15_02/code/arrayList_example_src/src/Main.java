import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        // заполним лист случайными целыми числами от 1 до 10

        for (int i = 0; i < 10; i++) {
            myNumbers.add((int) ((Math.random()*(10) + 1 )));
        }

        System.out.println(myNumbers);
        System.out.println("Длина листа: " + myNumbers.size());

        System.out.println();

        Collections.sort(myNumbers);
        System.out.println(myNumbers);

        //стандартный цикл for each  для вывода печать ArrayLst
        for (int i : myNumbers) {
            System.out.print( i + " | " );
        }

    }
}







/*         ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(( Math.random() * (10 - 1 + 1) + 1));
            myNumbers.add(i, randomNum);
        }
        // печать списка как есть
        for (int i : myNumbers) {
            System.out.print(i + " | ");
        }
            System.out.println();
        Collections.sort(myNumbers);  // Sort myNumbers
        // печать списка после сортировки циклом for each
        for (int i : myNumbers) {
            System.out.print(i + " | ");
        }
 */