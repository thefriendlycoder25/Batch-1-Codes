package practicals;

class refill1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("First Thread ");
            i++;
        }
    }
}
public class thread2 {
    public static void main(String[] args) {
        refill1 r1 = new refill1();
        Thread pen1 = new Thread(r1, "Chintu");
        pen1.start();

    }
}
class refill2 implements Runnable{
    @Override
    public void run() {
        int i = 0 ;
        while (i < 400) {
            System.out.println(i++);
        }
    }
}
//    refill2 r2 = new refill2();
//    Thread pen2 = new Thread(r2, "Pintu");