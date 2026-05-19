import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(
                "Rohan",
                1234,
                10000
        );
        ATM atm = new ATM(account);
        int enteredPin;
        int attempts = 0;
        System.out.println("===== WELCOME TO ATM =====");
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            enteredPin = sc.nextInt();
            if (enteredPin == account.getPin()) {
                atm.showMenu();
                return;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");
            }
        }
        System.out.println("Account Locked!");
    }
}