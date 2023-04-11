import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        System.out.println("Date and Time Example");

        Table_reservation tr1 = new Table_reservation(1,true, LocalDateTime.now());
        System.out.println(tr1);

        /*LocalDate myToday = LocalDate.now(); // Create a date object

        System.out.println("Today is: " + myToday); // Display the current date / Показать текущую дату
        System.out.println();

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        System.out.println();

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + myDateTime);
        System.out.println();

        System.out.println("Before formatting: " + myDateTime);
        DateTimeFormatter myFormatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateTime.format(myFormatDateTime);
        System.out.println("After formatting: " + formattedDate);*/


    }
}