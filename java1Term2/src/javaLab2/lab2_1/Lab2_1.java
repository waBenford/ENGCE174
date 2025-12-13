package javaLab2.lab2_1;
import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Student ID: " );
		String getId = getValue.nextLine();
		
		System.out.print( "Student Name: " );
		String getName = getValue.nextLine();
		
		Student newStudent = new Student( getId , getName );
		
		System.out.println( newStudent.studentId );
		System.out.println( newStudent.name );
		
	}

}

class Student {
	public String studentId;
	public String name;
	
	public Student( String id, String n ){
		this.studentId = id;
		this.name = n;
	}
}