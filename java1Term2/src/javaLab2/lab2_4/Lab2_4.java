package javaLab2.lab2_4;
import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Name: " );
		String Name = getValue.nextLine();
		
		System.out.print( "Midterm Score: " );
		int Mid = getValue.nextInt();
		
		System.out.print( "Final Score: " );
		int Final = getValue.nextInt();
		
		System.out.println();
		
		Student displayStudent = new Student( Name, Mid, Final );
		System.out.println( displayStudent.displaySummary() );
	}

}

class Student {
	public String Name;
	public int midtermScore;
	public int finalScore;
	
	public Student( String N, int M, int F ) {
		this.Name = N;
		this.midtermScore = M;
		this.finalScore = F;
	}
	
	public double calculateAverage() {
		double Average = this.midtermScore + this.finalScore;
		Average = Average / 2;
		return Average;
	}
	
	public String displaySummary() {
		String status;
		if( this.calculateAverage() > 50 ) {
			status = "Pass";
		}else {
			status = "Fail";
		}
		String display = "Name: " + this.Name + "\nAverage Score: " + this.calculateAverage() + "\nStatus: " + status;
		return display;
	}
}