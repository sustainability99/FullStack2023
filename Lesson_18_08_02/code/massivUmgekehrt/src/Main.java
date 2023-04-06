import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 99 ; i++) {
            System.out.print(i+1+" "); // hier lassen wier den Array füllen von 1-99
        }
        System.out.println();
        for (int i = 99; i > 0 ; --i) {
            System.out.print(i+" ");  // hier füllen wir den Array umgekehrt von 99-1
        }

    }
}