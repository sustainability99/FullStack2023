public class Main {
    public static void main(String[] args) {
        System.out.println("Ein Beispiel mit zwei Interfaces");
        System.out.println();

        BankCard card = new BankCard();
        card.creditMethod();
        card.debitMethod();
    }
}