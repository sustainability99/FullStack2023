public abstract class Animal {
    String name;

    // метод для звуков
    public void makeNoise(){
    }

    // метод для еды
    public void eat() {
    }

    // метод выводит описание
    public void getDescription(){
    }

    // сеттер имени (собака, кошка или медведь)
    public Animal(String name) {
        this.name = name;
    }
}