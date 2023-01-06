package practicals;
//Constructor overloading
class ext1{
    int r , m; // class variables/attributes
    ext1()
    {
        System.out.println("This is nalla constructor");
    }
    ext1(int rollno){
        r = rollno;
        System.out.println("This asign only roll no i.e 1 parameter");
    }
}

public class const2 {
    ext1 obj1 = new ext1();


}
