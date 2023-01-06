package practicals;
class papa{
    String name;
}
class putra extends papa{
    String name;
    void setName(String name){
        this.name = name; // sets derived class 'name' variable
    }
    void setDadName(String name){
        super.name = name; //sets parent class 'name' varaible
    }
    void getDadName(){
        System.out.println(super.name);//prints parent class 'name' varaible
    }
}
public class thisandSuper {
    public static void main(String[] args) {
        putra kush = new putra();
        kush.setName("Kush");
        System.out.println(kush.name);
        kush.setDadName("Ram");
        kush.getDadName();





    }
}
