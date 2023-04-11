import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "/Users/valentindaines/Meine Ablage/Mein Code/FullStack_23.2/Lesson 31 28.02.23/Code/file_io_example1/src/";

        // Создание нового файла
        System.out.println("Пример работы с файлом - СОЗДАНИЕ НОВОГО ФАЙЛА");

        try {
            File myFile = new File ( path + "test.txt"); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

       // Запись в файл текста
        System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt"); // используем класс и его метод
            myWriter.write("Это НАША запись текста в файл."); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
}

/*
//

        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

 */