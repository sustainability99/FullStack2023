public class Main {
    public static void main(String[] args) {
        System.out.println("Wandeln eine binäre Zahl in eine dezimale Zahl um:");

        String string_num = "111000111000111000";
        int binaryNumber = Integer.parseInt(string_num,2);
        System.out.println("Das ist die dezimale Zahl aus 111000111000111000 --->>>  " + binaryNumber);

        System.out.println();

        System.out.println("Jezt wandeln wir eine Dezimalzahl in eine binäre Zahl um: ");
        long n = 9876543210l;
        String binNum = Integer.toBinaryString((int) n);
        System.out.println("Das ist die binäre Zahl von 9876543210 --->>>   " + binNum);
    }
}