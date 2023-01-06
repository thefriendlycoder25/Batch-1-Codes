package practicals;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageTeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        System.out.println("Enter your Birth Date in dd/mm/yyyy");
        String dob1 = sc.next();
        System.out.println(dob1);

        String[] arr = dob1.split("/");

        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        LocalDate dob2 = LocalDate.of(y,m,d);

        int days = Period.between(dob2, today).getDays();
        int months = Period.between(dob2 , today).getMonths();
        int years = Period.between(dob2, today).getYears();

        System.out.println("You are "+days+" days, "+months+" months"+years+" years age old");
        System.out.println("It was "+ dob2.getDayOfWeek()+ "when you first cried");


    }
}
