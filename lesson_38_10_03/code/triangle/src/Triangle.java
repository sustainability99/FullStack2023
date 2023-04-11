public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        if ((a >= b + c) || (b >= a + c) || (c >= a + b)) {
            System.out.println("So einen Dreieck gibt es nicht.");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("So einen Dreieck gibt es");
        }
    }
}
