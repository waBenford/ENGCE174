package javaLab1;
import java.util.Scanner;

public class Lab1_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "Input Number: " );
		int Number = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= Number; i++) {
			System.out.print( "            : " );
			int a = scanner.nextInt();
			sum += a;
		}
		
		System.out.println( "Sum = " + sum );
		
	}

}
