package javaLab3.lab3_4;
import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine();
		
		for ( int i = 0; i < qty; i++ ) {
			System.out.print( "Product Name: " );
			String Name = getValue.nextLine();
			
			Product newProduct = new Product( Name );
		}
		System.out.println( "= " + Product.getProductCount() );
	}

}

class Product {
	private String name;
	private static int productCount = 0;
	
	public String getName() { return this.name; }
	public static int getProductCount() { return productCount; }
	
	public Product( String N ) {
		this.name = N;
		this.productCount += 1;
	}
	
}
