package javaLab1;
import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "" );
		int Score = scanner.nextInt();
		
		if ( Score < 0 || Score > 100 ) {
			System.out.println( "Invalid Score" );
		}
		else if ( Score >= 80 ) {
			System.out.println( "A" );
		}
		else if ( Score >= 70 ) {
			System.out.println( "B" );
		}
		else if ( Score >= 60 ) {
			System.out.println( "C" );
		}
		else if ( Score >= 50 ) {
			System.out.println( "D" );
		}
		else {
			System.out.println( "F" );
		}
	}

}
