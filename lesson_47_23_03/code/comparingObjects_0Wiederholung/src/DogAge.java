import java.util.Comparator;

public class DogAge implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.age - o2.age;
    }
}
