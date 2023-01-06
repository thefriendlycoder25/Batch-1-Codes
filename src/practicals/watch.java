package practicals;
class analogueWatch{
    void time(){
        System.out.println("Displays time");
    }
    void date(){
        System.out.println("Displays date");
    }
}
class digitalWatch extends analogueWatch{
    void alarm(){
        System.out.println("Alarm ringing!!");
    }
void stopwatch(){
        System.out.println("Running the stopWatch");
    }
}
class smartWatch extends digitalWatch{
    void stepTracker(){
        System.out.println("Counts the steps");
    }
}
public class watch {
    public static void main(String[] args) {
     smartWatch obj1 = new smartWatch();
     obj1.time();
     obj1.date();
     obj1.alarm();
     obj1.stopwatch();

    }
}
