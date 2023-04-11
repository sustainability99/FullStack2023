import java.util.TreeSet;

public class Main {
    //дача 1. Создайте TreeSet и внесите в него федеративные земли Германии. Выведите список земель на печать.

    public static void main(String[] args) {
        System.out.println("Alle 16 Bundesländer in einem TreeSet");

        TreeSet bund = new TreeSet();

        bund.add("Schleswig-Holstein SH\n"); // Bleibt nicht auf der ersten Stelle TreeSet sortiert
        bund.add("Baden-Württemberg BW\n");
        bund.add("Bayern BY\n");
        bund.add("Brandenburg BB\n");
        bund.add("Bremen HB\n");
        bund.add("Hamburg HH\n");
        bund.add("Hessen HE");
        bund.add("Mecklenburg-Vorpommern MV\n");
        bund.add("Niedersachsen NI\n");
        bund.add("Nordrhein-Westfalen NRW\n");
        bund.add("Rheinland-Pfalz RP\n");
        bund.add("Saarland SL\n");
        bund.add("Sachsen SN\n");
        bund.add("Sachsen-Anhalt ST\n");
        bund.add("Thüringen TH\n");
        bund.add("Berlin BE\n");
        bund.add("Berlin BE\n"); // TreeSet lässt keine Kopien/Dopplungen zu

        System.out.println(bund);
    }
}