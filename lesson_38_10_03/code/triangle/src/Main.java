import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null; // Resetten Buffer.
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben Sie die erste Seite des Dreiecks: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Geben Sie die erste Seite des Dreiecks: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Geben Sie die erste Seite des Dreiecks: ");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle(a, b, c);
    }
}