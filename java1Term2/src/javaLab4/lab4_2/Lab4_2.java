package javaLab4.lab4_2;
import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "1/2: " );
		int mode = getValue.nextInt();
		getValue.nextLine();
		
		if( mode == 1 ) {
			String name = getValue.nextLine();
			Product product = new Product( name );
			product.displayinfo();
		}else if( mode == 2 ) {
			String name = getValue.nextLine();
			double price = getValue.nextDouble();
			Product product = new Product( name, price );
			product.displayinfo();
		}
	}

}

class Product {
	private String name;
	private double price;
	
	public void displayinfo() {
		System.out.println( "Product: " + this.name + ", Price: " + this.price );
	}
	
	public Product( String name ) {
		this.name = name;
		Product product = new Product( name, 0.0 );
	}
	
	public Product( String name, double price ) {
		this.name = name;
		this.price = price;
	}
}