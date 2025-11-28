package javaLab1;
import java.util.Scanner;

public class Lab1_5 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Choose menu: " );
		int num = getValue.nextInt();
		
		if ( num == 1 ) {
			System.out.println( "Americano" );
		} else if ( num == 2 ) {
			System.out.println( "Latte" );
		} else if ( num == 3 ) {
			System.out.println( "Espresso" );
		} else if ( num == 4 ) {
			System.out.println( "Mocha" );
		} else {
			System.out.println( "Invalid Menu" );
		}
	}

}
