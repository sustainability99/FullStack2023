public class Main {
    public static void main(String[] args) {
        System.out.println("Experiment mit indifikator static");
        Car c1 = new Car(0,"gray");
        c1.paint();
        System.out.println(c1);
        System.out.println();

        Auto a1 = new Auto(0,"red",5);
        a1.paint();
        System.out.println(a1);
        System.out.println(Car.platform);
    }
}