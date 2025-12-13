package javaLab2.lab2_3;
import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine();
		
		for( int i = 0; i < qty; i++ ) {
			System.out.print( "Student ID: " );
			String id = getValue.nextLine();
			
			System.out.print( "Student Name: " );
			String Name = getValue.nextLine();
			
			Student newStudent = new Student( id, Name );
		}
		
		System.out.println(Student.studentCount);
		
	}
}

class Student {
	public String studentId;
	public String name;
	
	static int studentCount;
	
	public Student( String Id, String Name ) {
		this.studentId = Id;
		this.name = Name;
		studentCount++;
	}
}