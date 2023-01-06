package practicals;

public class meth {

    static int area(int a, int b) throws negativeParam{
        if(a<0||b<0){
            throw new negativeParam();
        }
        return (a*b);
    }
    public static void main(String[] args) {

//        System.out.println("The division is " + area(-6,5));



    }

}
