import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Wir schreiben das Wort verkehrt rum : ");

        String word = "троллейбус";
          System.out.println(word);

        int lengthOfWord = word.length();
          System.out.println("Die Länge des Wortes in  " + lengthOfWord + "Symbolen");

        ArrayList<String> letters = new ArrayList<String>();
        for (int i = 0; i < lengthOfWord ; i++) {
            //
            //
            //
            letters.add(i, String.valueOf(word.charAt(i)));

            System.out.println(letters);
        }
        ArrayList<String> lettersReverse = new ArrayList<>();
        for (int i = 0; i < lengthOfWord; i++) {
          lettersReverse.add(( (i )),  letters.get(lengthOfWord -1 - i));
        }

      System.out.println("Word rückwärts ");
      System.out.println(lettersReverse); // die Liste ausdrucken

    }
}
