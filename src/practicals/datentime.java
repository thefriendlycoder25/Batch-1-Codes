package practicals;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class datentime {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
//        returns today's date object

        LocalTime t = LocalTime.now();
//        returns a time object , also calculates milisecs

        LocalDateTime dnt = LocalDateTime.now();
//        returns today's date and time in a single object
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        custom format used to represent a date
        String date = df.format(dt);
//        adding date object to the custom date format we made
        System.out.println(date);

        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfMonth());

    }
}
