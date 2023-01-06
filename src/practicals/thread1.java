package practicals;
//creating a thread
class mythread1 extends Thread{
    @Override
    public void run() {
        int i =0;
        while(i<500){
            System.out.println("This is thread1");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<500){
            System.out.println("THREAD2 IS THIS");
            i++;
        }
    }
}
class mythread3 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<500){
            System.out.println("YO YO THREAD3");
            i++;
        }
    }
}
class mythread4 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<500){
            System.out.println(i++);
        }
    }
}


public class thread1 {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        t1.setPriority(Thread.MIN_PRIORITY);
        mythread2 t2 = new mythread2();
        t2.setPriority(Thread.NORM_PRIORITY);
        mythread3 t3 = new mythread3();
        t3.setPriority(10);
        mythread4 t4 = new mythread4();
        t4.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


