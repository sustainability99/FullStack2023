public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Перевод десятичного числа в двоичное (будет выведено строкой)");
        long n = 9876543210l;
        System.out.println("Десятичное число: " + n);

        String binaryNum = "";
        binaryNum = Long.toBinaryString(n);
        System.out.println("Двоичное представление этого числа: " + binaryNum);
        System.out.println();

        String octagalNum = Long.toOctalString(n);
        System.out.println("В восьмеричной системе это: " + octagalNum);
        System.out.println();

        String hexNum = Long.toHexString(n);
        System.out.println("В 16-ричной системе это: " + hexNum);
        System.out.println();

        //Пееревод числа из типа String в числовой тип int
        System.out.println("Перевод строки, содержащей число, в число");
        String strNum = "155";
        System.out.println("Строка с цифрами:  " + strNum);
        int num1 = Integer.parseInt(strNum); // присвоили найденное в строке число в переменную
        System.out.println("Получилось число: " + num1); // находим число внутри строки
        System.out.println();

        String st = "5";
        int table_num = Integer.parseInt(st);
        System.out.println("Номер столика: " + table_num);
    }
}