package practicals;
class majhiException extends Exception{
    @Override
    public String toString() {
        return ("Congrats you have called a Custom Excepion!");
    }

    @Override
    public String getMessage() {
        return ("Enter a positive dimension");
    }
}

public class ExceptionHandling {


    static float divide(float a ,float b){

        return (a/b);
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int [] arr = {63,68,69,78,97};
        String str = "five";
        try{
            throw new majhiException();
//            System.out.println(a/b);
//            System.out.println(arr[6]);
//            str.length();System.out.println(divide(6,4));
//            a = Integer.parseInt(str);
//            System.out.println("The value converted is "+a);
//            System.out.println(divide(arr[6], b));
        }
        catch(ArithmeticException ae){
            System.out.println("Buddhu Zero se divide kar diya");
            System.out.println("Chal vapas enter kar");
            int c = 5;
            System.out.println(divide(arr[6],c));
        }
        catch(IndexOutOfBoundsException ib){
            System.out.println(ib.toString());
            System.out.println("Array ki seema ke bahar ja rahe ho!");
        }
        catch (Exception e){

            System.out.println(e.getMessage());
        }

        System.out.println("This is after try block");
        for(int i=1;i<=10;i++){
            System.out.print(i*a+" ");
        }
    }

}
