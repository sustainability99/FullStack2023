public class Address extends Employee { // Hier erweitern wir die Klasse **Address** über die Klasse **Employee**

    String adresse;

    public Address(String name, String eMail, int IDnum, String adresse) {
        super(name, eMail, IDnum);
        this.adresse = adresse;
    }


    public String getAdresse() {
        return adresse;
    }
}
