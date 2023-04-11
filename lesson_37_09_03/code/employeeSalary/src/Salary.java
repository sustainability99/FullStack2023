public class Salary extends Employee { // Hier erweitern wir die Klasse **Salary** über die Klasse **Employee**
    private double salary;

    public Salary(String name, String eMail, int IDnum, double salary) {
        super(name, eMail, IDnum); // Felder aus dem Grundklasse **Employee** rausgeholt
        this.salary = salary; // Zusätzlich noch ein Feld über das Einkommen eingefügt.
    }
    public void mailPaySlip() {
        System.out.println("Das ist Methode für die Klasse Employee");
        System.out.println("Sehr geehrter " + getName()  + " wir senden Informationen über das Einkommen auf die Adresse " +geteMail() );
        System.out.println("Das ist ihr Einkommen: " + getSalary());
        System.out.println("Das ist ihr Monatseinkommen: " + getSalary()/12);
    }

    public double getSalary() {
        return salary;
    }
    // Setter für das Einkommen

    public void setSalary(double newSalary) { //übergeben neues Wert in newSalary
        //this.salary = salary;
        if (newSalary > 0 ) { //wenn das Einkommen mehr als **0** ist, wird Wert übergeben
            salary = newSalary;
        }
    }

    @Override
    public String toString() {
        return "Salary " +
                "salary = " + salary +
                '.';
    }
}
