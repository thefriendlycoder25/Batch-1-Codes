package practicals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        //To create a file
        File f = new File("Success.txt");
        try{
            f.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

    // To write a file
        try {
            FileWriter fW = new FileWriter("Success.txt");
            fW.write("This is a file created using java file handling");
            fW.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileWriter fw = new FileWriter("Success.txt",true);
            fw.write("This is the second update to the file");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        //To read a file
        try {
            Scanner sc = new Scanner(f);
            if (sc.hasNextLine()) {
                String text = sc.nextLine();
                System.out.println(text);
            } else {
                System.out.println("This file is empty");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

//        To delete a file
        f.delete();

    }
}


