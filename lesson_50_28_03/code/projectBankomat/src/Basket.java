import java.util.ArrayList;

public class Basket {
    ArrayList products;
    User user;

    public Basket(ArrayList products, User user) {
        this.products = products;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                ", user=" + user +
                '}';
    }
}
