package practicals;
class base{
    base(){ // executes when we dont use super(paramters) in derived
        System.out.println("Unparameterized default constructor");
    }
    base(int a ,int b) // gets the parameters from super(a,b) in derived
    {
        System.out.println("Base Class Constructor "+a+" "+b);
    }
base(int c){

}}
class derived extends base{
    derived(int a , int b){
       super(a,b); // to pass the parameters to base class constructor

        System.out.println("Derived Class constructor "+a+" "+b);
    }
    derived(int c){
        super(c);
    }
}
public class inhertSuper {
    public static void main(String[] args) {
        derived obj1 = new derived(2);
    }
}
