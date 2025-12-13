package javaLab3.lab3_6;
import java.util.Scanner;

public class Lab3_6 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Starting balance: " );
		double starting = getValue.nextDouble();
		
		System.out.print( "Deposit amount: " );
		double deposit = getValue.nextDouble();
		
		System.out.print( "Withdrawal amount: " );
		double withdraw = getValue.nextDouble();
		
		BankAccount bank = new BankAccount( starting );
		bank.deposit(deposit);
		bank.withdraw(withdraw);
		
		System.out.println( "Final balance: " + bank.getBalance() );
	}

}

class BankAccount {
	private double balance;
	
	public double getBalance() { return this.balance; } 				//getter
	
	public BankAccount( double initialBalance ) {
		if ( initialBalance >= 0 ) {
			this.balance = initialBalance;
		}else if ( initialBalance < 0 ) {
			this.balance = 0;
		}
	}
	
	public void deposit( double amount ) {								//setter
		if ( amount > 0  ) {
			this.balance += amount;
			System.out.println( "Deposit successful." );
		}else if ( amount <= 0 ) {
			System.out.println( "invalid deposit amount." );
		}
	}
	
	public void withdraw( double amount ) {
		if ( amount > 0 && amount <= this.balance ) {					//setter
			this.balance -= amount;
			System.out.println( "Withdrawal successful." );
		}else if ( amount > this.balance ) {
			System.out.println( "Insufficient funds." );
		}else if ( amount <= 0 ) {
			System.out.println( "Withdrawal amount." );
		}
	}
	
}
