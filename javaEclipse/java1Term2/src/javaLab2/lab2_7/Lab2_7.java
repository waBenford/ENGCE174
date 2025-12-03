package javaLab2.lab2_7;
import java.util.Scanner;

public class Lab2_7 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Name: " );
		String name = getValue.nextLine();
		
		System.out.print( "Current balance: " );
		double balance = getValue.nextDouble();
		
		System.out.print( "1.Amount: " );
		double amount1 = getValue.nextDouble();
		
		System.out.print( "2.Amount: " );
		double amount2 = getValue.nextDouble();
		
		BankAccount bank = new BankAccount( name, balance );
		
		System.out.println( bank.withDraw(amount1) );
		System.out.println( bank.withDraw(amount2) );
		
		System.out.println( bank.displayBalance() );
	}

}

class BankAccount {
	public String ownerName;
	public double balance;
	
	public BankAccount( String N, double B ) {
		this.ownerName = N;
		this.balance = B;
	}
	
	public String withDraw( double amount ) {
		if( amount <= this.balance ) {
			this.balance -= amount;
			return "Withdrawal Successful.";
		}else {
			return "Insufficient Funds.";
		}
	
	}
	
	public String displayBalance() {
		String display = "Balance: " + this.balance;
		return display;
	}
}
