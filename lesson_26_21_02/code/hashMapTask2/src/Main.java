import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Список группы с указанием пола");

        HashMap<String, String> group23 = new HashMap<String, String>();

        int man = 0; // кол-во мужчин
        int woman = 0; // кол-во женщин

        group23.put( "Vadim", "Man");
        group23.put( "Leonid", "Man");
        group23.put( "Lilian", "Man");
        group23.put( "Viacheslav", "Man");
        group23.put( "Katerina", "Women");
        group23.put( "Dina", "Women");
        group23.put( "Natalia", "Women");
        group23.put( "Elisabeth", "Women");
        group23.put( "Ekaterina", "Women");

        for (String i : group23.keySet()) {
            // System.out.println(group23.get(i));
            if (group23.get(i).equals("Man")) { // берем значение для ключа i
                man++; // увеличили кол-во мужчин на 1
            }
        }

        for (String i : group23.keySet()) {
            // System.out.println(group23.get(i));
            if (group23.get(i).equals("Women")) { // берем значение для ключа i
                woman++; // увеличили кол-во мужчин на 1
            }
        }

        System.out.println("Мужчин в группе: " + man);
        // int woman = group23.size() - man;
        System.out.println("Женщин в группе: " + woman);

    }
}


