package javaLab3.lab3_12;
import java.util.Scanner;

class Employee {
	private String name;
	private double monthlySalary;
	
	public Employee(String name, double monthlySalary) {
		this.name = name;
		
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void giveRaise(double amount) {
		if (amount > 0) {
			this.monthlySalary += amount;
			System.out.println("Raise applied.");
		} else {
			System.out.println("Invalid amount.");
		}
	}
	
	private double getAnnualSalary() {
		return monthlySalary * 12;
	}
	
	public double calculateTax(double taxRate) {
		return getAnnualSalary() * taxRate;
	}
}

public class Lab3_12 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Name: " );
		String name = getValue.nextLine();
		double monthlySalary = getValue.nextDouble();
		double taxRate = getValue.nextDouble();
		double raiseAmount = getValue.nextDouble();
		getValue.nextLine();

		Employee employee = new Employee(name, monthlySalary);
		
		System.out.printf("Tax (Before): %.1f%n", employee.calculateTax(taxRate));
		
		employee.giveRaise(raiseAmount);
		
		System.out.printf("Tax (After): %.1f%n", employee.calculateTax(taxRate));
		
		getValue.close();
	}
}