public class Phone {

    String phoneNumber;
    String brand;
    String model;

    @Override
    public String toString() {
        return "Phone  " +
                "phoneNumber = '" + phoneNumber + '\'' +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                '.';
    }

    public void receiveCall(String name) {  // Signatur der Methode
        System.out.println("Ruft an: " + name);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Phone(String phoneNumber, String brand, String model) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
