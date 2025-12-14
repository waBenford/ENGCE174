package javaLab3.lab3_14;
import java.util.Scanner;

class BankAccount {
	private double balance;
	private static int totalTransactionCount = 0;
	
	public BankAccount(double initialDeposit) {
		if (initialDeposit > 0) {
			this.balance = initialDeposit;
		} else {
			this.balance = 0;
		}
		System.out.println("Account created.");
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			totalTransactionCount++;
			System.out.println("Deposit successful.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			totalTransactionCount++;
			System.out.println("Withdrawal successful.");
		} else if (amount > this.balance) {
			System.out.println("Insufficient funds.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	public static int getTotalTransactionCount() {
		return totalTransactionCount;
	}
}

public class Lab3_14 {
    
	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		BankAccount myAccount = null; 
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine();

		for (int i = 0; i < qty; i++) {
			String command = getValue.nextLine();
			
			if (command.equals("CREATE")) {
				double initialDeposit = getValue.nextDouble();
				getValue.nextLine();
				myAccount = new BankAccount(initialDeposit);
				
			} else if (command.equals("DEPOSIT") || command.equals("WITHDRAW")) {
				double amount = getValue.nextDouble();
				getValue.nextLine();
				
				if (myAccount == null) {
					System.out.println("No account exists.");
				} else if (command.equals("DEPOSIT")) {
					myAccount.deposit(amount);
				} else { 
					myAccount.withdraw(amount);
				}
				
			} else if (command.equals("STATUS")) {
				if (myAccount != null) {
					System.out.println("Balance: " + myAccount.getBalance()); 
				} else {
					System.out.println("No account exists.");
				}
				
			} else if (command.equals("GLOBAL_STATUS")) {
				System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
			}
		}
		
		getValue.close();
	}
}