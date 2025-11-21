package javaLab1;
import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "" );
		int Score = scanner.nextInt();
		
		if ( Score >= 80 && Score <= 100 ) {
			System.out.println( "A" );
		}
		else if ( Score >= 70 && Score <= 79 ) {
			System.out.println( "B" );
		}
		else if ( Score >= 60 && Score <= 69 ) {
			System.out.println( "C" );
		}
		else if ( Score >= 50 && Score <= 59 ) {
			System.out.println( "D" );
		}
		else {
			System.out.println( "F" );
		}
	}

}
