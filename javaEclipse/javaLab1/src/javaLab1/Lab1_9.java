package javaLab1;
import java.util.Scanner;

public class Lab1_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int N1 = input.nextInt();
		int[] qty = new int[N1];
		float sum = 0;
		float Average = 0;
		
		for ( int i = 0; i < N1; i++ ) {
			
			System.out.print( "" );
			qty[i] = input.nextInt();
			
			sum += qty[i];
		}
		
		Average = sum / N1;
		System.out.println( "sum = " + Average );

	}

}
