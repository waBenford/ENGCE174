package javaLab2.lab2_6;
import java.util.Scanner;

public class Lab2_6 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Name: " );
		String name = getValue.nextLine();
		
		System.out.print( "Current balance: " );
		double balance = getValue.nextDouble();
		
		System.out.print( "Amount: " );
		double amount = getValue.nextDouble();
		
		BankAccount Bank = new BankAccount( name, balance );
		Bank.deposit(amount);
		
		System.out.println( Bank.displaySummary() );
	}

}

class BankAccount {
	public String ownerName;
	public double initialBalance;
	
	public BankAccount ( String N, double B ) {
		this.ownerName = N;
		this.initialBalance = B;
	}
	
	public void deposit( double amount ) {
		this.initialBalance += amount;
	}
	
	public String displaySummary() {
		String display = "Owner: " + this.ownerName + "\nBalance: " + this.initialBalance;
		return display;
	}
}
