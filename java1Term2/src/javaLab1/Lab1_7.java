package javaLab1;
import java.util.Scanner;

public class Lab1_7 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int num = getValue.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print( ": " );
			int a = getValue.nextInt();
			sum += a;
		}
		
		System.out.println( "Sum = " + sum );
		
	}

}
