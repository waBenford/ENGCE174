package javaLab5.lab5_5;
import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Radius:" );
		double Radius = getValue.nextDouble();
		
		System.out.println( "Width/Height:" );
		double Width = getValue.nextDouble();
		double Height = getValue.nextDouble();
		
		Shape Cir = new Circle( "Circle", Radius );
		Shape Rect = new Rectangle( "Rectangle", Width, Height );
		
		Shape[] Shapes = { Cir, Rect };
		int lenShapes = Shapes.length;
		
		for( int i = 0; i < lenShapes; i++ ) {
			System.out.println( Shapes[i].calculateArea() );
		}
	}

}

class Shape {
	protected String name;
	
	//constructor
	public Shape( String Name ) {
		this.name = Name;
	}
	
	public double calculateArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	protected double radius;
	
	//constructor
	public Circle( String Name, double Radius ) {
		super(Name);
		this.radius = Radius;
	}
	
	@Override
	public double calculateArea() {
		double Radius2 = Math.pow(radius, 2);
		double areaCircle = 3.14159 * Radius2;
		return areaCircle;
	}
}

class Rectangle extends Shape {
	protected double width;
	protected double height;
	
	//constructor
	public Rectangle( String Name, double Width, double Height ) {
		super(Name);
		this.width = Width;
		this.height = Height;
	}
	
	@Override
	public double calculateArea() {
		double areaRectangle = this.width * this.height;
		return areaRectangle;
	}
}