package javaLab1;
import java.util.Scanner;

public class Lab1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		System.out.print( "Choose menu: " );
		int Number = scanner.nextInt();
		
		if ( Number == 1 ) {
			System.out.println( "Americano" );
		} else if ( Number == 2 ) {
			System.out.println( "Latte" );
		} else if ( Number == 3 ) {
			System.out.println( "Espresso" );
		} else if ( Number == 4 ) {
			System.out.println( "Mocha" );
		} else {
			System.out.println( "Invalid Menu" );
		}
	}

}
