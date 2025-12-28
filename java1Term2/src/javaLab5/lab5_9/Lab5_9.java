package javaLab5.lab5_9;
import java.util.Scanner;

public class Lab5_9 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Product." );
		String Pname = getValue.nextLine();
		double price = getValue.nextDouble();
		int qty = getValue.nextInt();
		getValue.nextLine();
		
		System.out.println( "Subscription." );
		String Sname = getValue.nextLine();
		double Mcost = getValue.nextDouble();
		int qtyM = getValue.nextInt();
		
		Item product = new PhysicalProduct( Pname, price, qty );
		Item subscription = new DigitalSubscription( Sname, Mcost, qtyM );
		
		Item[] items = { product, subscription };
		
		double total = 0;
		for( Item i : items ) {
			total += i.getValue();
		}
		
		System.out.println( total );
		
	}

}

class Item { //Superclass ->
	protected String name;
	
	public Item( String Name ) {
		this.name = Name;
	}
	
	public double getValue() {
		return 0.0;
	}
} // <- Superclass

class PhysicalProduct extends Item { //Product
	protected double unitPrice;
	protected int quantity;
	
	public PhysicalProduct( String Name, double price, int quantity ) {
		super( Name );
		this.unitPrice = price;
		this.quantity = quantity;
	}
	
	@Override
	public double getValue() {
		return ( this.unitPrice * this.quantity );
	}
}

class DigitalSubscription extends Item { //Subscription
	protected double monthlyCost;
	protected int months;
	
	public DigitalSubscription( String Name, double Mcost, int month ) {
		super( Name );
		this.monthlyCost = Mcost;
		this.months = month;
	}
	
	@Override
	public double getValue() {
		return ( this.monthlyCost * this.months );
	}
}