import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Решение квадратного уравннеия: ");
        // что не входе - double a, double b, double c
        // что на выходе - сообщение про дискриминант и про корни квадратного уравнеия
        // ключевой алгоритм - уравнение выглядит a*x^2 + b*x + с = 0, нужно найти корни, когда уравнениевыполнится
        // нужно вычислить D = b*b - 4*a*c (double)
        // если D < 0 , то корней нет;  если D = 0, то x = -b/(2*a)
        // если D > 0, то вычисляем два корня
        // x1 = (-b + sqrt(D))/(2*a) ;  и x2 = (-b - sqrt(D))/(2*a)
        // интерфйс - попросить ввести a, b и с
        // сообщить ответ про D и корни

        Scanner sc = new Scanner(System.in);
        char userChoice; //переменная для выбора пользователя

        do {
            System.out.println("Ведите A (первый коэффициент кв. уравнения): ");
            double a = sc.nextDouble();

            System.out.println("Ведите B (первый коэффициент кв. уравнения): ");
            double b = sc.nextDouble();

            System.out.println("Ведите C (первый коэффициент кв. уравнения): ");
            double c = sc.nextDouble();

            double d = b * b - 4 * a * c;

            System.out.println("D = " + d);


            if (d < 0) {
                System.out.println("Дискриминант отрицательный, уравнения нет.");
            } else {
                if (d == 0) {
                    double x = -b / (2 * a);
                    System.out.println("Дискриминант равен 0, корень уравнения: " + x);
                } else {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("Дискриминант больше 0, корень уравнения: " + x1 + " ; " + x2);
                }
            }
            System.out.println("Для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = sc.next().toLowerCase().charAt(0);// имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {
                break;
            }
        } while (true);
    }

}