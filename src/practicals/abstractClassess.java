package practicals;
abstract class discounts {
    int minDiscount; // variable
    int addDiscount;
    protected void greet(){ //normal(non-abstract method)
        System.out.println("Please select any of below cards for additional discount");
    }
    abstract void additionalDiscount();//unimplemented method
}
 class hdfc extends discounts{
     @Override
     void additionalDiscount() { //abstract method
         super.addDiscount=1000;
         System.out.println("Extra discount of 1000 credited");
     }
 }
 class sbi extends discounts{
    @Override
    void additionalDiscount(){
        super.addDiscount=750;
        System.out.println("Extra discount of 750 credited");
    }
 }
public class abstractClassess {
    public static void main(String[] args) {
        hdfc h1= new hdfc();
        h1.additionalDiscount();
        sbi s1 = new sbi();
        s1.additionalDiscount();
    }
}


