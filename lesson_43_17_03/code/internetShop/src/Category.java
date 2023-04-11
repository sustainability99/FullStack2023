import java.util.ArrayList;

public class Category {
   // Создать класс Категория, имеющий переменные имя и массив товаров.
    String name; // name der Kategorie
    ArrayList products; // Massiv von Produkten

    //Starten Constructor der Klasse Category ***cmd + n***
    public Category(String name, ArrayList products) {
        this.name = name;
        this.products = products;
    }

    // bearbeiten die Methode toString, was beinhaltet unsere Klasse Category

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
