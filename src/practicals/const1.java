package practicals;

import java.util.Scanner;
//Only constructor program
class ext{
   int r ,m;
    ext(int rollno, int marks)
    {
        r = rollno;
        m = marks;
    }
    void display()
    {
        System.out.println("roll no  : "+r+ " Marks :"+m);
    }
}

public class const1 {
    public static void main(String[] args) {
       ext obj1 = new ext(5,10);
	ext obj1 = new ext(5,10);



    }

}
