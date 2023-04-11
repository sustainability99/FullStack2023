import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("Сортируем собак по именам и возрасту");

        List dogList = new ArrayList();

        Dog dog1 = new Dog("Шегги", 3);
        Dog dog2 = new Dog("Бобик", 10);
        Dog dog3 = new Dog("Роджер", 10);
        Dog dog4 = new Dog("Альма", 4);
        Dog dog5 = new Dog("Тамми", 1);

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);

        Collections.sort(dogList);   // Сортируем список
        System.out.println(dogList); // печатаем результат

        // Сортируем список, используя компаратор

        Collections.sort(dogList, new DogAge());
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }
        System.out.println();

        Collections.sort(dogList, new DogNames());
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }

        Collections.sort(dogList);   // Сортируем список
        System.out.println(dogList); // печатаем результат

        // Сортируем список, используя компаратор


    }
}