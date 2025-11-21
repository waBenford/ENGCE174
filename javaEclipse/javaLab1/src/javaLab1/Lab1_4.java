package javaLab1;
import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "input your score: " );
		int Score = scanner.nextInt();
		
		if ( Score > 79 ) {
			System.out.println( "A" );
		}else if ( Score > 69 ) {
			System.out.println( "B" );
		}else if ( Score > 59 ) {
			System.out.println( "C" );
		}else if ( Score > 49 ) {
			System.out.println( "D" );
		}else {
			System.out.println( "F" );
		}
	}

}
