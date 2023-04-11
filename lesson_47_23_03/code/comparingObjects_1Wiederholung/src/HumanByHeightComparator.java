import java.util.Comparator;

public class HumanByHeightComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.height - b.height; // сравниваем номера в математическом порядке

    }
}