public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] roullete = new int[36]; // Array wird bestimmt auf 36 /Инициализируем массив на 36 значений/

        for (int i = 0; i < roullete.length; i++) {   // в цикле for происходит заполнение массива значениями от 1 до 36.
            roullete[i] = i + 1; // Hier werden die Zahlen gefüllt **1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |....
            System.out.print(roullete[i] + " | "); // Hier werden sie ausgegeben
        }

        System.out.println();

        for (int j = 0; j < 20; j++) {    // i < 20 bedeutet 20 Mal drehen
            int result = (int) (Math.random()*(36-1+1)+1); // Zufällige Zahlen von 1-36
            int color1 = (int) (Math.random()*(1-0+1)+0); //Zufall 0 oder 1 was die Farbe bedeutet


            // Ungerade Zahlen SCHWARZ| Gerade Zahlen ROT
            String color;
            String isEven; // gerade und ungerade Zahlen . Kann als Boolean sein?

            if (result%2==0){
                //color = "red";
                isEven = "gerade Zhal";
            }else {
                //color = "black";
                isEven = "ungerade Zahl";
            }
            if (color1 == 0) {
                color = "rot";
            } else {
                color = "schwarz";
            }
            System.out.println(" Gewonnen : " + result + " | " + color +" | " +isEven);
        }
    }
}