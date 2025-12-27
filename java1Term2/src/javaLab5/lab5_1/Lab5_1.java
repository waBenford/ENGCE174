package javaLab5.lab5_1;
import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Name/Age:" );
		String name = getValue.nextLine();
		int age = getValue.nextInt();
		
		Dog dog = new Dog( name, age );
		dog.makeSound();
		dog.displayInfo();
	}

}

class Animal {
	protected String name;
	protected int age;
	
	public void displayInfo() {
		System.out.println( "Name: " + this.name + ", Age: " + this.age );
	}
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println( "Woof! Woof!" );
	}
	
	public Dog( String n, int a ) {
		this.name = n;
		this.age = a;
	}
}