package javaLab1;
import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Number: " );
		int num = getValue.nextInt();

		for (int i = 1; i <= 12; i++) {
			
			int sum = num * i;
			
			System.out.print( num );
			System.out.print( " * " );
			System.out.print( i );
			System.out.print( " = " );
			System.out.println( sum );
		}
		
	}

}
