import java.util.Comparator;

public class HumanByNameComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.name.compareTo(b.name); // сравниваем имена в алфавитном порядке
        // метод compareTo стандартный метод для String
    }
}