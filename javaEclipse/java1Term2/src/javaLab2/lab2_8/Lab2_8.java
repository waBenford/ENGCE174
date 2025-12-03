package javaLab2.lab2_8;
import java.util.Scanner;

public class Lab2_8 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Mode: " );
		String mode = getValue.nextLine();
		
		System.out.print( "Temp: " );
		double temp = getValue.nextDouble();
		
		if( mode.equals( "C_TO_F" ) ) {
			System.out.println( "= " + TempConverter.celsiusToFahrenheit(temp) );
		}
		else if( mode.equals( "F_TO_C" ) ) {
			System.out.println( "= " + TempConverter.fahrenheitToCelsius(temp) );
		}
	}

}

class TempConverter {
	public static double celsiusToFahrenheit( double celsius ) {
		double fahrenheit = ( celsius * 9.0/5.0 ) + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius( double fahrenheit ) {
		double celsius = ( fahrenheit - 32 ) + 5.0/9.0;
		return celsius;
	}
}
