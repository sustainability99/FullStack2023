import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Создадим список марок автомобилей
        ArrayList<String> brandList = new ArrayList<String>();

        brandList.add("BMW");
        brandList.add("Mercedes");
        brandList.add("VW");
        brandList.add("Ford");
        brandList.add("Fiat");
        brandList.add("Opel");

        System.out.println(brandList); // "грубая" распечатка содержимого

        int size = brandList.size(); // узнаем размер листа
        System.out.println("Рамер листа, который создали: " + size);

        int index = brandList.indexOf("Fiat");
        System.out.println("Номер " + "Fiat" + " в списке " + index);

        brandList.remove(4); // eдаляем 4-й номер из листа
        System.out.println(brandList); // печать после удаления

        boolean BrandPresents = brandList.contains("Opel"); // проверка на наличие
        System.out.println(BrandPresents);

        // проверяем, что объект ест в списке и тогда он не добавляется
        if (brandList.contains("Opel") == false) {
            brandList.add("Opel");
        }

        System.out.println(brandList);
        // добавим отсутствующий бренд в список, если его нет в списке

        if (brandList.contains("Audi") == false) {
            brandList.add("Audi");
        }

        System.out.println(brandList);

        // распечатка листа c индексами
        for (int i=0; i < brandList.size(); i++) {
            System.out.println(i + " " + brandList.get(i));
        }

        System.out.println();

        // Сортировка листа
        Collections.sort(brandList); // вызов алгоритма сортировки

        for (int i=0; i < brandList.size(); i++) {
            System.out.println(i + " " + brandList.get(i));
        }

    }
}










/* // Создадим список марок автомобилей
        // ArrayList<Type> name = new ArrayList<Type>();
        ArrayList<String> autoBrand = new ArrayList<String>();
        autoBrand.add ("BMW");
        autoBrand.add ("Opel");
        autoBrand.add ("VW");
        autoBrand.add ("Audi");
        autoBrand.add("Mercedes");
        System.out.println("ArrayList : " + autoBrand); // вывести на печать список
        int n = autoBrand.size(); // узнать размер/длину
        System.out.println(n);
        int index = autoBrand.indexOf("Mercedes"); // узнать индекс объекта в списке
        System.out.println(index);
        String str = autoBrand.get(0); // взять объект по индексу (номеру в списке)
        System.out.println(str);
        autoBrand.remove("Opel"); // удалить объект
        n = autoBrand.size();
        System.out.println(n);
        System.out.println("ArrayList : " + autoBrand);
        boolean autoBrandPresents = autoBrand.contains("Opel"); // проверка на наличие
        System.out.println(autoBrandPresents);
        // добавим отсутствующий бренд в список
        if (autoBrand.contains("Opel") == false) {
            autoBrand.add ("Opel");
        }
        System.out.println("ArrayList : " + autoBrand);
        if (autoBrand.contains("Opel") == true) {
            System.out.println("Такой бренд уже есть в списке");
        } else {
            autoBrand.add ("Opel");
        }
        System.out.println("ArrayList : " + autoBrand);
        // вывод списка объектов на печать в цикле
        for (int i = 0; i < autoBrand.size(); i++) {
            System.out.print(autoBrand.get(i) + " | ");
        }
        System.out.println();
        // сортировка списка
        Collections.sort(autoBrand);
        for (int i = 0; i < autoBrand.size(); i++) {
            System.out.print(autoBrand.get(i) + " | ");
        }
 */
