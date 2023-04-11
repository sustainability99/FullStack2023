public class Main {
    public static void main(String[] args) {
        System.out.println("Mitarbeiter und Einkommen");
        // Ein System entwickeln, in der Die Mitarbeiter und ihr Einkommen aufgenommen werden.
        // Möglichkeit eine E-Mail an die Mitarbeiter zu schicken, mit der Einkommensinformation.
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате

        // So funktioniert es nicht ein Exemplar **employee** zu erzeugen
        //Employee employee1 = new Employee("Ivanov Petr", "ivanov.p@mail.com",101);
        //  employee1.mailPaySlip();

        // Erschaffen einen neuen Mitarbeiter mit Einkommen
        Salary s1 = new Salary("Ivanov Peter", "ivanov.p@mail.com", 101,60000);
        Salary s2 = new Salary("Petriv Ivan", "petriv.i@mail.com", 102,48000);

        //Ausgabe zum testen
        //System.out.println(s1);
       // System.out.println(s2);

        System.out.println("Wir rufen dei Methode **PaySlip** auf");
        s1.mailPaySlip();
        System.out.println();
        s2.mailPaySlip();

        s2.setSalary(54000);//neues Einkommen eingegeben
        System.out.println();
        s2.mailPaySlip(); // Informiert über e-Mail







    }

    public static class Main {
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
}