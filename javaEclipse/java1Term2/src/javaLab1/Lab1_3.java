package javaLab1;
import java.util.Scanner;

public class Lab1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "Input your number: " );
		int Number = scanner.nextInt();
		
		if ( Number % 2 == 0 ) {
			System.out.println( "                 : Even" );
		}else {
			System.out.println( "                 : Odd" );
		}
	}

}
