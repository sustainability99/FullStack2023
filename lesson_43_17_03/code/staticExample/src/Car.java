public class Car {

    static final String platform = "Number 1";
    static int age = 5;
    static String color = "grey";

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void paint(){
        System.out.println("The Car is painted in this color  - " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                "platform " + platform;
    }
}
