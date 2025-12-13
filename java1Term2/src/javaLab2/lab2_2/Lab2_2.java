package javaLab2.lab2_2;
import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Student ID: " );
		String getId = getValue.nextLine();
		
		System.out.print( "Student Name: " );
		String getName = getValue.nextLine();
		
		Student newStudent = new Student( getId , getName );
		
		String infoStudent = newStudent.displayInfo();
		
		System.out.println(infoStudent);
	}

}

class Student {
	public String studentId;
	public String name;
	
	public Student( String id, String n ) {
		this.studentId = id;
		this.name = n;
	}
	
	public String displayInfo() {
		String info = this.studentId + "\n" + this.name;
		return info;
	}
}