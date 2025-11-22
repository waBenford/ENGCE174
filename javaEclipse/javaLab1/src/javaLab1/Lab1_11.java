package javaLab1;
import java.util.Scanner;

public class Lab1_11 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		int[] arrQty = new int[qty];
		
		for (int i = 0; i < qty; i++) {
			System.out.print( "" );
			arrQty[i] = getValue.nextInt();
		}
		
		int sum = sumArray(arrQty);
		System.out.println( "sum: " + sum );

	}
	
	public static int sumArray( int[] numbers ) {
		int sum = 0;
		for ( int i = 0; i < numbers.length; i++ ) {
			sum += numbers[i];
		}
		return sum;
	}

}
