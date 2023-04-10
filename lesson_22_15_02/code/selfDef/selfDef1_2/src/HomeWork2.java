import java.util.ArrayList;
import java.util.Collections;

public class HomeWork2 {

    /*Задача 2
    Имеются результаты забега на 100 метров группы бегунов из 10 участников.
    Внести эти результаты в компьютер согласно протоколу.
    Отсортировать результаты, напечатать кто занял 1-е и кто занял последнее место.
     */
    public static void main(String[] args) {

        ArrayList<String>  hundredMeterRun = new ArrayList<String>();

          hundredMeterRun.add(" 9.58_|_Noah Müller");
          hundredMeterRun.add("10.02_|_Lukas Schmidt");
          hundredMeterRun.add("10.08_|_Felix Schneider");
          hundredMeterRun.add("10.20_|_Leon Fischer");
          hundredMeterRun.add("10.25_|_Luca Weber");
          hundredMeterRun.add("10.29_|_Jonas Mayer");
          hundredMeterRun.add("11.01_|_Leo Becker");
          hundredMeterRun.add("11.11_|_Maximilian Wagner");
          hundredMeterRun.add("11.12_|_Milan Schulz");
          hundredMeterRun.add("12.12_|_Oskar Neumann");

        Collections.sort(hundredMeterRun);


          for (int i=1; i < hundredMeterRun.size(); i++) {

              System.out.println("Auf dem Platz Nr.: " + i + " *** Mit der Zeit " + hundredMeterRun.get(i));

          }
        System.out.println();
        System.out.println("Den ERSTEN  Platz hat:  " + hundredMeterRun.get(0));
        System.out.println("Den LETZTEN Platz hat:  " + hundredMeterRun.get(9));

        }
    }
