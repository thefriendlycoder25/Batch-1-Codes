package practicals;

class parent
{
    int parentAge;
    void showParent(){
        System.out.println("This is parent classs");
    }
}
class child extends parent{
    int childAge;
    void showChild(){
        System.out.println("This is my child class");
    }
}
public class inheritance {
    public static void main(String[] args) {
        child obj1 = new child();
        obj1.parentAge = 5;
        obj1.showParent();
        obj1.childAge = 8;
        obj1.showChild();


    }

}
