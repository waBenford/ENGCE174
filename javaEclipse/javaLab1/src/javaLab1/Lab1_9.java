package javaLab1;
import java.util.Scanner;

public class Lab1_9 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "quantity: " );
		int numqty = getValue.nextInt();
		int[] qty = new int[numqty];
		float sum = 0;
		float avr = 0;
		
		for ( int i = 0; i < numqty; i++ ) {
			
			System.out.print( "" );
			qty[i] = getValue.nextInt();
			
			sum += qty[i];
		}
		
		avr = sum / numqty;
		System.out.println( "sum = " + avr );

	}

}
