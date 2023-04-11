public abstract class Employee {

    private String name; // Feld für den Namen / privat - kein Zugriff aus anderen Klassen
    private String eMail; // Feld für das E-Mail / privat - kein Zugriff aus anderen Klassen
    private int IDnum; // Indifikations Nummer intern din der Firma / privat - kein Zugriff aus anderen Klassen

    public Employee(String name, String eMail, int IDnum) {
        this.name = name;
        this.eMail = eMail;
        this.IDnum = IDnum;
    }

    // Methode zum Verschicken einer e-Mail über die Informationen
    public void mailPaySlip() {
        System.out.println("Das ist Methode für die Klasse Employee");
        System.out.println("Sehr geehrter " + this.name + " wir senden Informationen über das Einkommen auf die Adresse " + this.eMail);
    }

    // Methode für die Ausgabe über toString
    @Override
    public String toString() {
        return "Employee" +
                "name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", IDnum=" + IDnum +
                '.';
    }

    // Das sind drei Getter Methoden
    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public int getIDnum() {
        return IDnum;
    }
}

// So haben wir ein Objekt (bzw. einen idealen Mitarbeiter beschrieben)