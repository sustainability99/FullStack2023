public class Employee {

    int empID;
    String name, address;

    // Generieren den Constructor für die Klasse Employee - ohne Modifizierung
    public Employee(int empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    // etwas modifizierte Methode toString
    @Override
    public String toString() {
        return this.empID + " " + this.name + " " + this.address;
    }
}
