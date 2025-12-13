package javaLab1;
import java.util.Scanner;

public class Lab1_10 {
	
	//main
	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Width: " );
		double width = getValue.nextDouble();
		System.out.print( "Height: " );
		double height = getValue.nextDouble();
		
		double area = calculateArea(width, height);
		
		System.out.println( "Area: " + area );
	}
	
	//method calculate
	public static double calculateArea(double a, double b) {
		return a * b;
	}

}
