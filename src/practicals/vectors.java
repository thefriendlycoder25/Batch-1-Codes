package practicals;

import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<String> airlines = new Vector<String>();


        airlines.add("Air India");
        airlines.add("Vistara");
        airlines.add("Indigo");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");
        airlines.add("Emirates");

        System.out.println(airlines);
        System.out.println(airlines.size());

        System.out.println(airlines.capacity());

    }
}
