public class Wine {

    String name;
    String sort;
    int year;

    @Override
    public String toString() {
        return "Wine " +
                " name = " + name + '\'' +
                ",  sort = " + sort + '\'' +
                ",  year = " + year +
                '.';
    }

    public String onStock(int n){
        return  ("Auf lager sind vorhanden : " + n + " Flaschen ");
    }

    public int getYear() {
        return year;
    }
}
