public class Circle extends Shape{
    double radius;

    // Constructor für die Klasse Shape
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

}
