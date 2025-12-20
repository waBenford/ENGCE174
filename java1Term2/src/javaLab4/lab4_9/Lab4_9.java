package javaLab4.lab4_9;
import java.util.Scanner;

class ImmutableAccount {
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = (balance < 0.0) ? 0.0 : balance;
    }

    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(this.accountId, this.balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            return new ImmutableAccount(this.accountId, this.balance - amount);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Lab4_9 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);

        System.out.println( "ID:" );
        String id = getValue.nextLine();
        double initialBalance = getValue.nextDouble();
        double depositAmount = getValue.nextDouble();
        double withdrawAmount = getValue.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);
        ImmutableAccount acc2 = acc1.deposit(depositAmount);
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        acc1.displayInfo();
        acc3.displayInfo();

        getValue.close();
    }
}