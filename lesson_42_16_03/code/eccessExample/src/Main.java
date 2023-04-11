public class Main {
    public static void main(String[] args) {
        System.out.println("Beispiel für den Zugriff auf die Felder (Modifikator public, privat ...");

        Person person = new Person("Kate", 23, "Baker Street 26", "+123456789");

        person.displayName();
        person.displayAge();
        person.displayPhone();
        //person.displayAddress wird garnicht ausgelistet da **privat**

    }
}