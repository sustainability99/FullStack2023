public class Main {
    public static void main(String[] args) {
        System.out.println("Klasse Telefon Praktikum");

        Phone phone1 = new Phone("+7 903 123 45 67", "Samsung","A5");
        Phone phone2 = new Phone("+49 653 987 12", "Apple","iPhone X10");
        Phone phone3 = new Phone("+84 503 429 11", "Oppo","Find N2");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

       /* Phone myPhone1 = new Phone(); // Erzeugen neues Exemplar einer Klasse
          myPhone1.phoneNumber = "+7 903 123 45 67"; // Geben konkrete Parameter des Exemplares
          myPhone1.brand = "Samsung"; // Geben konkrete Parameter des Exemplares
          myPhone1.model = "A5"; // Geben konkrete Parameter des Exemplares

        Phone myPhone2 = new Phone(); // Erzeugen neues Exemplar einer Klasse
          myPhone2.phoneNumber = "+49 653 987 12"; // Geben konkrete Parameter des Exemplares
          myPhone2.brand = "Apple"; // Geben konkrete Parameter des Exemplares
          myPhone2.model = "iPhone X10"; // Geben konkrete Parameter des Exemplares

        Phone myPhone3 = new Phone(); // Erzeugen neues Exemplar einer Klasse
          myPhone2.phoneNumber = "+84 503 429 11"; // Geben konkrete Parameter des Exemplares
          myPhone2.brand = "Oppo"; // Geben konkrete Parameter des Exemplares
          myPhone2.model = "Find N2"; // Geben konkrete Parameter des Exemplares

        System.out.println(myPhone1.toString());
        System.out.println(myPhone2.toString());
        System.out.println(myPhone3.toString());

        myPhone1.receiveCall("Mein Kummpel!");

        System.out.println("Nummer des ersten Telefons:" + myPhone1.getPhoneNumber());*/



    }
}