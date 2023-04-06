import java.util.ArrayList;
//SelfDef Übung mit Temperaturen

public class Main {
    public static void main(String[] args) {
        System.out.println("Wetter in Karlsruhe nächste 7 Tage von **Wetter.de**");

        ArrayList<String> wochen = new ArrayList<>();

        wochen.add("Montag 27.02.23");
        wochen.add("Dienstag 28.02.23");
        wochen.add("Mittwoch 01.03.23");
        wochen.add("Donnerstag 02.03.23");
        wochen.add("Freitag 03.03.23");
        wochen.add("Samstag 04.03.23");
        wochen.add("Sonntag 05.03.23");

        ArrayList<Double> temp = new ArrayList<Double>();

        temp.add(4.0);
        temp.add(5.5);
        temp.add(7.5);
        temp.add(8.0);
        temp.add(8.5);
        temp.add(8.7);
        temp.add(8.2);

        for (int i  = 0; i < temp.size(); i++){
            System.out.println(temp.get(i) + "°C     " + wochen.get(i));
        }

        double durchschnitt = 0;
        for(Double d : temp)
            durchschnitt += d /7;
        System.out.printf("Durchschnittliche Temperatur lag bei  " + "%.1f%n", durchschnitt);

            
        }
    }
