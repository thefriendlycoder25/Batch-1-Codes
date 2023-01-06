package practicals;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("I am Iron Man");
        str.append("3000");
        System.out.println(str);// add 3000 at the end permanently
        int c= str.length();
        str.insert( c-2 , "Thor");
        System.out.println(str);
        str.replace(5,14,"Encrypted");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,6);
        System.out.println(str);
    }
}



//                String str  = "I am Iron Man";
//                System.out.println(str.concat("3000"));//tempororily changes for this line
//                System.out.println(str);//Unchanged String
//
//                str = "Thor Odinson";//changed because of reassignment
//                System.out.println(str);