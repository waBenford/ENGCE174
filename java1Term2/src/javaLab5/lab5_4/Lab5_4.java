package javaLab5.lab5_4;
import java.util.Scanner;

public class Lab5_4 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Color/Wheels" );
		String color = getValue.nextLine();
		int wheels = getValue.nextInt();
		
		Car car = new Car( color, wheels );
		car.displayDetails();
	}

}

class Vehicle {
	protected String color;
	
	public Vehicle( String color ) {
		this.color = color;
	}
}

class Car extends Vehicle {
	protected int wheels;
	
	public Car( String color,int wheels ) {
		super(color);
		this.wheels = wheels;
	}
	
	public void displayDetails() {
		System.out.println( "Color: " + this.color + ", Wheels: " + this.wheels );
	}
}