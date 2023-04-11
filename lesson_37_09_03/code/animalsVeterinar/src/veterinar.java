public class veterinar {
    String name;

    public void treatAnimal(Animal animal) {
        System.out.println("На прием пришла " + animal.name);
        animal.makeNoise();
        animal.getDescription();
    }
}
