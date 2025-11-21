package javaLab1;
import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "quantity: " );
		int N = scanner.nextInt();
		int[] qty = new int[N];
		int maxValue = Integer.MIN_VALUE;

		for ( int i = 0; i < N; i++ ) {
			
			System.out.print( "" );
			qty[i] = scanner.nextInt();
			
			if ( qty[i] > maxValue ) {
				maxValue = qty[i];
			}
			
		}
		
		System.out.println( "Maximum Value: " + maxValue );
		
	}

}
