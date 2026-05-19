import java.util.Scanner;
public class ATM {
    private Account account;
    public ATM(Account account) {
        this.account = account;
    }
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(
                            "Current Balance: ₹" +
                                    account.getBalance()
                    );
                    break;
                case 2:
                    System.out.print("Enter Amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter Receiver Name: ");
                    sc.nextLine();
                    String receiver = sc.nextLine();
                    System.out.print("Enter Amount: ₹");
                    double transferAmount = sc.nextDouble();
                    account.transfer(
                            transferAmount,
                            receiver
                    );
                    break;
                case 5:
                    account.showTransactionHistory();
                    break;
                case 6:
                    System.out.println(
                            "Thank You For Using ATM"
                    );
                    break;
                default:
                    System.out.println(
                            "Invalid Choice"
                    );
            }
        } while (choice != 6);
    }
}