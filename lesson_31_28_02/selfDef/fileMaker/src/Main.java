import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "/Users/valentindaines/Meine Ablage/Mein Code/FullStack_23.2/Lesson 31 28.02.23/Homework/FileMaker/src/";

        // Erstellen einer neuen Datei
        System.out.println("Ein Beispiel wie wir eine Datei in Intellij erstellen - File create");

        try {
            File datei = new File ( path + "FileMaker.txt"); // Name der Datei eingeben

            if (datei.createNewFile()) {
                System.out.println("Datei erstellt: " + datei.getName());
            } else {
                System.out.println("Diese Datei existiert bereits.");
            }
        } catch (IOException e) {
            System.out.println("Fehler! Bitte überprüfen Sie die Daten.");
            e.printStackTrace();
        }

        // Text in die erstellte Datei schreiben
        System.out.println("Beispiel wie wir in die Datei Text reinschreiben - TEXT IN DATEI");

        try {
            FileWriter datenSchreiber = new FileWriter(path + "FileMaker.txt"); // Klasse FileWriter und seine Methode
            datenSchreiber.write("Das ist ein Test.\n"); // Schreiben Text, der in die Datei kommt
            datenSchreiber.write("Wir schreiben einen Text in die Datei.\n"); // Schreiben Text, der in die Datei kommt
            datenSchreiber.write("Mehrere Sätze gleichzeitig."); // Schreiben Text, der in die Datei kommt
            datenSchreiber.close(); // Die Methode wird geschlossen/ wie beim ***Scanner***
            System.out.println("Datei wurde erfolgreich erstellt."); // Meldung über die erfolgreiche Erstellung der Datei
        } catch (IOException e) {  // fangen den Fehlen ein und legen sie in die Variable mit Namen **e**
            System.out.println("Fehler! Bitte überprüfen Sie die Daten."); // Meldung über den Fehler
            e.printStackTrace(); // Fehler wird hier beschrieben und ausgegeben
        }
        // Lesen aus der erstellten Datei
        System.out.println("Beispiel wie wir aus der erstellen Datei lesen - LESEN AUS DER DATEI.");

        try {
            File datenSchreiber = new File(path + "FileMaker.txt");
            Scanner myReader = new Scanner(datenSchreiber); // Scanner zum Lesen vorbereiten
            while (myReader.hasNextLine()) {   // lesen solange Text eingegeben wird
                String data = myReader.nextLine(); // Lesen den Satz
                System.out.println(data); // Ausgabe gelesene Satz/Sätze
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fehler! Bitte überprüfen Sie die Daten.");
            e.printStackTrace();
        }
    }
}
