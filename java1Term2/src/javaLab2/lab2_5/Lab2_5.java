package javaLab2.lab2_5;
import java.util.Scanner;

public class Lab2_5 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Width: " );
		double width = getValue.nextDouble();
		
		System.out.print( "Height: " );
		double height = getValue.nextDouble();
		
		Ractangle ractangle = new Ractangle( width, height );
		
		System.out.println( "Area = " + ractangle.getArea() );
		System.out.println( "Parimeter = " + ractangle.getPerimeter() );
	}

}

class Ractangle {
	public double width;
	public double height;
	
	public Ractangle( double w, double h ) {
		this.width = w;
		this.height = h;
	}
	
	public double getArea() {
		double Area = this.width * this.height;
		return Area;
	}
	
	public double getPerimeter() {
		double Perimeter = 2 * ( this.width + this.height );
		return Perimeter;
	}
}