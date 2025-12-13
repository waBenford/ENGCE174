package javaLab1;
import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "quantity: " );
		int num = getValue.nextInt();
		int[] qty = new int[num];
		int max = Integer.MIN_VALUE;

		for ( int i = 0; i < num; i++ ) {
			
			System.out.print( "" );
			qty[i] = getValue.nextInt();
			
			if ( qty[i] > max ) {
				max = qty[i];
			}
			
		}
		
		System.out.println( "Maximum Value: " + max );
		
	}

}
