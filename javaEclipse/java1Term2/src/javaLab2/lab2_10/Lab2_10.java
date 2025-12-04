package javaLab2.lab2_10;
import java.util.Scanner;

public class Lab2_10 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Quantity: " );
		int n = getValue.nextInt();
		getValue.nextLine();
		
		shoppingCart cart1 = new shoppingCart();
		
		for( int i = 0; i < n; i++ ) {
			System.out.print( "Name: " );
			String name = getValue.nextLine();
			
			System.out.print( "Price: " );
			double price = getValue.nextDouble();
			getValue.nextLine();
			
			Product product = new Product( name, price );
			cart1.addProduct(product);
		}
		
		System.out.println( cart1.calculateTotalPrice() );
		
	}

}

class Product {
	private String name;
	private double price;
	
	public String getName() { return this.name; }
	public double getPrice()  { return this.price; }
	
	public void setName( String setN ) { this.name = setN; }
	public void setPrice( double setP ) { this.price = setP; }
	
	public Product( String N, double P ) {
		this.name = N;
		this.price = P;
	}
}

class shoppingCart {
	private Product[] items;
	private int itemCount;
	
	public Product[] getItems() { return this.items; }
	public int getCount() { return this.itemCount; }
	
	public void setItems( Product[] setI ) { this.items = setI; }
	public void setCount( int setP ) { this.itemCount = setP; }
	
	public shoppingCart() {
		this.items = new Product[10];
		this.itemCount = 0;
	}
	
	public void addProduct( Product p ) {
		this.items[this.itemCount] = p;
		this.itemCount += 1;
	}
	
	public double calculateTotalPrice() {
		double totalPrice = 0.0;
		
		for( int i = 0; i < this.itemCount; i++ ) {
			Product currentProduct = this.items[i];
			totalPrice += currentProduct.getPrice();
		}
		return totalPrice;
	}
}