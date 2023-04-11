import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список группы 23-2");

        HashMap<String, Integer> group23 = new HashMap<String, Integer>();

        group23.put( "Vadim", 25);
        group23.put( "Leonid", 25);
        group23.put( "Lilian", 25);
        group23.put( "Viacheslav", 25);
        group23.put( "Katerina", 25);

        for (String i : group23.keySet()) {
            System.out.println("Name: " + i + " | " + " Age: " + group23.get(i));
        }
    }
}