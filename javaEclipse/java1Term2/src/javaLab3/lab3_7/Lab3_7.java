package javaLab3.lab3_7;
import java.util.Scanner;

public class Lab3_7 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "ID: " );
		String id = getValue.nextLine();
		
		System.out.print( "Old department: " );
		String oldDe = getValue.nextLine();
		
		System.out.print( "New department: " );
		String newDe = getValue.nextLine();
		
		Employee employee = new Employee( id, oldDe );
		employee.setDepartment(newDe);
		
		System.out.println( employee.getEmployeeid() );
		System.out.println( employee.getDepartment() );
	}

}

class Employee {
	private String employeeID;
	private String department;
	
	public String getEmployeeid() { return this.employeeID; }
	public String getDepartment() { return this.department; }
	
	public Employee( String employee, String department ) {
		this.employeeID = employee;
		this.department = department;
	}
	
	public void setDepartment( String newDepartment ) {
		this.department = newDepartment;
	}
}
