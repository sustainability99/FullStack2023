public class Programmer extends Human {
    public int experience; // offenes Feld, sagt über die Erfahrung in Jahren aus

    public Programmer(int age, boolean isWorker, int experience) {
        super(age, isWorker);
        this.experience = experience;
    }
}
