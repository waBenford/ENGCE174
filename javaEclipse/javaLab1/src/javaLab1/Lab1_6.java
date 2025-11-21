package javaLab1;
import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "Input Number: " );
		int Number = scanner.nextInt();

		for (int i = 1; i <= 12; i++) {
			
			int sum = Number * i;
			
			System.out.println( Number + " * " + i + " = " + sum );
		}
	}

}
