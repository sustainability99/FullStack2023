public class Voter {
    String numID;
    int age;
    String name;

    public Voter(String id_Num, int age, String name) {
        this.numID = id_Num;
        if (age >= 16) { this.age = age;
            System.out.println("Der Wähler ist wahlbefugt.");
        } else {
            this.age = age;
            System.out.println("Der Wähler ist nicht wahlbefugt.");
        }
        if (name != null){ this.name = name;
        } else System.out.println("Das Feld Name darf nicht leer sein.");
    }

    @Override
    public String toString() {
        return "Voter --> " +
                " numID = " + numID + "|" +
                "| age= " + age +
                "| name= " + name + "|" ;
    }
}
