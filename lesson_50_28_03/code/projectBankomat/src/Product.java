import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Product {
    String name;
    String color;
    double price;
    int raiting;


    public Product(String name, String color, double price, int raiting) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.raiting = raiting;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return this.name + " " + this.color + ", " + this.price+"€" + ", " + this.raiting + "★";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (raiting != product.raiting) return false;
        return name.equals(product.name);
    }
    static void writeDataInFile(String path, String fileName, String data) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write(data); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            //System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
    }
    static String readDataFromFile(String path, String fileName) {
        String data = ""; // сюда считаем данные из файла
        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); // считываем строку
                // System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }
    private static void createFile(String path, String fileName) {
        try {
            File myFile = new File ( path + fileName); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}