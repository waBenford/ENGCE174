package javaLab1;
import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Your Score: " );
		int score = getValue.nextInt();
		
		if ( score < 0 || score > 100 ) {
			System.out.println( "Invalid Score" );
		}
		else if ( score >= 80 ) {
			System.out.println( "A" );
		}
		else if ( score >= 70 ) {
			System.out.println( "B" );
		}
		else if ( score >= 60 ) {
			System.out.println( "C" );
		}
		else if ( score >= 50 ) {
			System.out.println( "D" );
		}
		else {
			System.out.println( "F" );
		}
	}

}
