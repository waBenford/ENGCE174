package javaLab3.lab3_8;
import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Stock Name: " );
		String sName = getValue.nextLine();
		
		System.out.print( "Started Stock: " );
		int sStock = getValue.nextInt();
		
		inventoryItem item = new inventoryItem( sName, sStock );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine();
		
		System.out.println();
		
		for( int i = 0; i < qty; i++ ) {
			System.out.print( "ADD or SELL: " );
			String ArS = getValue.nextLine();
			
			System.out.print( "Quantity: " );
			int sQty = getValue.nextInt();
			getValue.nextLine();
			
			if( ArS.equals("ADD") ) {
				item.addStock(sQty);
			}
			else if( ArS.equals("SELL") ) {
				item.sellStock(sQty);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println( "Final Stock: " + item.getStock() );
	}

}

class inventoryItem {
	private String productName;
	private int stock;
	
	public String getProductName() { return this.productName; }
	public int getStock() { return this.stock; }
	
	public inventoryItem( String productName, int initialStock ) {
		if( initialStock >= 0 ) {
			this.productName = productName;
			this.stock = initialStock;
		}else {
			this.stock = 0;
		}
	}
	
	public void addStock( int amount ) {
		if( amount > 0 ) {
			this.stock += amount;
			System.out.println( "Stock added." );
		}else {
			System.out.println( "Invalid amount." );
		}
	}
	
	public void sellStock( int amount ) {
		if( amount > 0 && amount <= this.stock ) {
			this.stock -= amount;
			System.out.println( "Sale successful." );
		}else if( amount > this.stock ) {
			System.out.println( "Not enough stock." );
		}else if( amount <= 0 ) {
			System.out.println( "Invalid amount." );
		}
	}
}
