package javaLab1;
import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "Width: " );
		double Width = scanner.nextDouble();
		
		System.out.print( "Height: " );
		double Height = scanner.nextDouble();
		
		double Area = Width * Height;
		System.out.println( "Area = " + Area );
	}
}