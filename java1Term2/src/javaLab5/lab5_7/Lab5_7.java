package javaLab5.lab5_7;
import java.util.Scanner;

public class Lab5_7 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Sales Empolyee." );
		String Sname = getValue.nextLine();
		double Ssalary = getValue.nextDouble();
		double Scommission = getValue.nextDouble();
		getValue.nextLine();
		
		System.out.println( "Manager." );
		String Mname = getValue.nextLine();
		double Msalary = getValue.nextDouble();
		double MfixedBonus = getValue.nextDouble();
		
		Employee sales = new Sales( Sname, Ssalary, Scommission );
		Employee manager = new Manager( Mname, Msalary, MfixedBonus );
		
		PayrollProcessor.process(sales);
		PayrollProcessor.process(manager);
	}

}

class Employee { //Superclass ->
	protected String name;
	protected double baseSalary;
	
	public Employee( String N, double B ) {
		this.name = N;
		this.baseSalary = B;
	}
	
	public double calculatePay() {
		return this.baseSalary;
	}
} // <- Superclass

class Sales extends Employee { //Sales
	protected double commissionRate;
	
	public Sales( String N, double B, double C ) {
		super( N, B );
		this.commissionRate = C;
	}
	
	@Override
	public double calculatePay() {
		double salesSalary = this.baseSalary + ( this.baseSalary * commissionRate );
		return salesSalary;
	}
}

class Manager extends Employee { //Manager
	protected double fixedBonus;
	
	public Manager( String N, double B, double fB ) {
		super( N, B );
		this.fixedBonus = fB;
	}
	
	@Override
	public double calculatePay() {
		double managerSalary = this.baseSalary + this.fixedBonus;
		return managerSalary;
	}
}

class PayrollProcessor {
	public static void process( Employee E ) {
		System.out.println( E.name + " total pay: " + E.calculatePay() );
	}
}