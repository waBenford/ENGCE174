package javaLab5.lab5_8;
import java.util.Scanner;

public class Lab5_8 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Student." );
		String Sname = getValue.nextLine();
		int Id = getValue.nextInt();
		getValue.nextLine();
		
		System.out.println( "Employee." );
		String Ename = getValue.nextLine();
		double Salary = getValue.nextDouble();
		
		Person student = new Student( Sname, Id );
		Person employee = new Employee( Ename, Salary );
		
		Person[] persons = { student, employee };
		
		for( Person p : persons ) {
			if( p instanceof Employee ) {
				Employee e = (Employee) p;
				e.applyBonus(1000.0);
			}
		}
		
		for( Person p : persons ) {
			System.out.println( p.getStatus() );
		}
	}

}

class Person {
	protected String name;
	
	public Person( String Name ) {
		this.name = Name;
	}
	
	public String getStatus() {
		return "Person " + this.name;
	}
}

class Student extends Person {
	protected int studentId;
	
	public Student( String Name, int Id ) {
		super( Name );
		this.studentId = Id;
	}
	
	@Override
	public String getStatus() {
		return "Studen: " + this.name + ", ID: " + this.studentId;
	}
}

class Employee extends Person {
	protected double salary;
	
	public Employee( String Name, double Salary ) {
		super( Name );
		this.salary = Salary;
	}
	
	public void applyBonus( double bonus ) {
		this.salary += bonus;
	}
	
	@Override
	public String getStatus() {
		return "Employee: " + this.name + ", Salary: " + this.salary;
	}
}