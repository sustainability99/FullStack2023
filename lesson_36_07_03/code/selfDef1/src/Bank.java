public class Bank {

    String nameBank;
    String iban;
    String nameKnd;

    @Override
    public String toString() {
        return "BankDaten : " +
                "NameBank = " + nameBank + " // " +
                " iban= " + iban + " // " +
                " NameKnd.:= " + nameKnd + " // " ;
    }
    public void bankData(String name){
        System.out.println("Welchen Mitarbeiter wollen Sie sprechen :  " + name);
    }

    public String getIban() {
        return iban;
    }

    public Bank(String nameBank, String iban, String nameKnd) {
        this.nameBank = nameBank;
        this.iban = iban;
        this.nameKnd = nameKnd;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }
}
