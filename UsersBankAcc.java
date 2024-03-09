import java.util.Scanner;
import java.util.Scanner;
public class UsersBankAcc {
    private double balance;
    double amount;
  int choice;
     UsersBankAcc(double balance) {
        this.balance = balance;
         System.out.println("The balance  is "+balance);
    }
    double getBal() {
        return balance;
    }
    void choseOption (){
         Scanner n=new Scanner (System.in);
         choice=n.nextInt();
    }
    void checkBal(){
        System.out.println("The balance in account is "+getBal());
    }
    void Deposit(){
       Scanner s=new Scanner (System.in);
        System.out.println("Enter the amount you want to deposit");
         amount=s.nextDouble();
         this.balance+=amount;
         System.out.println("The balance after deposit is "+balance);
    }
     void Withdrawal() {
         Scanner s=new Scanner (System.in);
         System.out.println("Enter the amount you want to withdraw");
         amount=s.nextDouble();
         if (getBal() >= amount) {
             this.balance -= amount;
             System.out.println("The balance after withdrawal  is " + balance);
         }
         else {
             System.out.println(" Sorry your transaction is failed !" +
                     "Your balance is Insufficient  ");
         }
     }
}