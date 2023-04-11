public class Main {
    public static void main(String[] args) {
        System.out.println("Beispiel Interface in Java");

        Vehicle vehicle1 = new Vehicle(); // create object
        vehicle1.moveFast(); // use method from Interface Move
        vehicle1.moveSlow(); // use method from Interface Move
    }
}