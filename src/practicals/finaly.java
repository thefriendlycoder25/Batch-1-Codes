package practicals;

public class finaly {
    static int convert(String str){
        int a;
        try{
            a= Integer.parseInt(str);
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("This is after try block");
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "1234";
        System.out.println("Integer value is"+convert(str));
    }
}
