import java.util.Scanner;

public class ATMachine extends UsersBankAcc {
    ATMachine(double balance) {
        super(balance);
    }

    void choseOption() {
        Scanner n = new Scanner(System.in);
        do {
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = n.nextInt();
            if (choice == 1) {
                checkBal();
            } else if (choice == 2) {
                Deposit();
            } else if (choice == 3) {
                Withdrawal();
            }
            else if (choice==4){
                System.out.println("Exiting !");
            }
        }
        while(choice!=4);


    }
}
