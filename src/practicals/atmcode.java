package practicals;
import java.util.Scanner;
class salary{
    int pin = 1234;
    int balance = 20000;
}
class savings extends salary{
    Scanner sc = new Scanner(System.in);
    int balance = 5000;
    boolean checkPin(int pin){
        if(pin==super.pin){
            return true;
        }
        return false;
    }
    boolean withdraw(){
        System.out.println("1.Salary 2. Savings");
        int c = sc.nextInt();
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        if(c==1){
            if(amount<=super.balance){
                super.balance = super.balance-amount;
                System.out.println("Withdraw Successfull");
                return true;
            }
                return false;
        }
        if (c == 2) {
            if(amount<=this.balance){
                this.balance = this.balance-amount;
                System.out.println("Withdraw Successfull");
                return true;
            }
                return false;

        }
        return true;
    }
    void checkBalance(){
        System.out.println("Salary Account balance "+super.balance);
        System.out.println("Savings Account balance "+this.balance);
    }
    void deposit(){
        System.out.println("1.Salary 2.Savings");
        int c = sc.nextInt();
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        if(c==1){
            super.balance = super.balance+amount;
            System.out.println("Deposit Successfull");
        }
         if(c==2){
            this.balance = this.balance+amount;
            System.out.println("Deposit Successfull");
        }

    }


}

public class atmcode {
    public static void main(String[] args) {
        savings s1 = new savings();
        Scanner sc = new Scanner(System.in);
        boolean b;
        System.out.println("Enter the Pin");
        int pin = sc.nextInt();
        try {
            b = s1.checkPin(pin);
            while (b) {
                System.out.println("1.Withdraw 2.Check Balance 3. Deposit 4.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        b = s1.withdraw();
                        break;
                    case 2:
                        s1.checkBalance();
                        break;
                    case 3:
                        s1.deposit();
                        break;
                    case 4:
                        System.out.println("Thank You");
                        b = false;
                        break;
                    default:
                        System.out.println("Choose valid options");
                        break;

                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Ejecting Card");
            pin=0000;
        }



    }
}
