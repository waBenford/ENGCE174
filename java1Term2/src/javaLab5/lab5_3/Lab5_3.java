package javaLab5.lab5_3;
import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Salary: " );
		double salary = getValue.nextDouble();
		
		Manager manager = new Manager( salary );
		System.out.println( manager.calculateBonus() );
	}

}

class Employee {
	protected double salary;
	
	public double calculateBonus() {
		double baseBonus = salary * 0.1;
		return baseBonus;
	}
}

class Manager extends Employee {
	public Manager( double salary ) {
		this.salary = salary;
	}
	
	@Override
	public double calculateBonus() {
		double baseBonus = super.calculateBonus();
		double extraBonus = this.salary * 0.05;
		double Bonus = baseBonus + extraBonus;
		return Bonus;
	}
}