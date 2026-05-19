import java.util.ArrayList;
public class Account {
    private String name;
    private int pin;
    private double balance;
    private ArrayList<String> transactionHistory =
            new ArrayList<>();
    public Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    public int getPin() {
        return pin;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(
                "Deposited ₹" + amount
        );
        System.out.println("Amount Deposited Successfully");
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            transactionHistory.add(
                    "Withdrawn ₹" + amount
            );
            System.out.println("Please collect your cash");
        }
    }
    public void transfer(double amount, String receiver) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            transactionHistory.add(
                    "Transferred ₹" + amount +
                            " to " + receiver
            );
            System.out.println("Transfer Successful");
        }
    }

    public void showTransactionHistory() {
        System.out.println("\n===== TRANSACTION HISTORY =====");
        if (transactionHistory.isEmpty()) {
            System.out.println("No Transactions Yet");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}