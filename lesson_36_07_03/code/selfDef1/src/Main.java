public class Main {
    public static void main(String[] args) {
        System.out.println("Praktische Arbeit zum Thema Klassen. Beispiel Bankwesen.");

        Bank b1 = new Bank("Triodos Bank","DE41500105172184456238", "Tomas Keller");
        Bank b2 = new Bank("Post Bank","DE14500105172277364391", "Marta Sigmund");
        Bank b3 = new Bank("Bonanza Bank","E09500105175813411987", "Miriam De Salvadore");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println(b1.getNameBank());
        System.out.println(b2.getNameBank());
        System.out.println(b3.getNameBank());



        /*Bank b1 = new Bank();
        b1.nameBank = "Triodos Bank";
        b1.iban = "DE41500105172184456238";
        b1.nameKnd = "Tomas Keller";

        Bank b2 = new Bank();
        b2.nameBank = "Post Bank";
        b2.iban = "DE14500105172277364391";
        b2.nameKnd = "Marta Sigmund";

        Bank b3 = new Bank();
        b3.nameBank = "Bonanza Bank";
        b3.iban = "DE09500105175813411987";
        b3.nameKnd = "Miriam De Salvadore";

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println();

        b1.bankData("Salivan Dorin");
        System.out.println();

        System.out.println("IBAN Bank 2 ***  " + b2.getIban());
        System.out.println("IBAN Bank 1 ***  " + b1.getIban());
        System.out.println("IBAN Bank 3 ***  " + b3.getIban());*/


    }
}