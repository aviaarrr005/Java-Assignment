class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accNum, double initialBalance) {
        this.accountNumber = accNum;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Error: Balance cannot be negative.");
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC12345", 5000);

        account.deposit(1500);
        account.withdraw(2000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}