package javaLab5.lab5_2;
import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Name/Age:" );
		String n = getValue.nextLine();
		int a = getValue.nextInt();
		
		Cat cat = new Cat( n, a );
		cat.displayInfo();
		cat.makeSound();
	}

}

class Animal {
	protected String name;
	protected int age;
	
	public void makeSound() {
		System.out.println( "I am animal." );
	}
	
	public void displayInfo() {
		System.out.println( "Name: " + this.name + ", Age: " + this.age );
	}
}

class Cat extends Animal {
	public Cat( String n, int a ) {
		this.name = n;
		this.age = a;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}