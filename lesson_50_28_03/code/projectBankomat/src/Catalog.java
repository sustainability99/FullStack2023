import java.util.ArrayList;

public class Catalog {
    String productName;
    ArrayList products;

    public Catalog(String productName, ArrayList products) {
        this.productName = productName;
        this.products = products;
    }

    @Override
    public String toString() {
        return this.productName + " " + '\n' + this.products ;
    }
}