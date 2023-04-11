public class Triangle extends Shape {

    double a; // Länge der Seite eines Dreiecks / длина стороны треугольника
    double h; // высота, проведенная к основанию / Höhe zur Basis gezogen

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    public double square() {
        return (a * h) / 2;
    }
}