package practicals;

import java.util.Scanner;
class external
{
    int n;
    void check()
    {
        if(n>0)
        {
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
public class first
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number");
     external gupta = new external();
     gupta.n = sc.nextInt();
     gupta.check();
    }

}
