import java.util.Comparator;

public class Raiting implements Comparator<Product> {
    @Override
    public int compare(Product d, Product d1) {
        return d1.raiting - d.raiting;
    }
}