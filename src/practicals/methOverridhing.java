package practicals;
class dad{
    void display(){
        System.out.println("I am Dad");
    }
    void shirtblue(){
        System.out.println("Size is XL in Dad class");
    }
}
class beta extends dad{
    @Override //annotation
    void shirtblue(){
        System.out.println("Overriden the size of same shirt to L (child class)");
    }
}
public class methOverridhing {
    public static void main(String[] args) {
        beta obj1 = new beta();
        obj1.shirtblue();

//        dad obj1 = new dad();
//        obj1.shirt();
    }
}
