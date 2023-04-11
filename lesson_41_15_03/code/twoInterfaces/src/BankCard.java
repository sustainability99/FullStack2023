public class BankCard implements Debit, Credit {
    @Override
    public void creditMethod() {
        System.out.println("Add some money to card account...");
    }

    @Override
    public void debitMethod() {
        System.out.println("Deduct some money from card account...");
    }
}
