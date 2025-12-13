package javaLab1;
import java.util.Scanner;

public class Lab1_12 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		int[] boxId = new int[qty];
		int[] boxStock = new int[qty];
		
		for ( int i = 0; i < qty; i++ ) {
			System.out.print( "ID: " );
			boxId[i] = getValue.nextInt();
			System.out.print( "Stock: " );
			boxStock[i] = getValue.nextInt();
		}
		
		System.out.println( "" );
		System.out.print( "Search ID: " );
		int search = getValue.nextInt();
		
		boolean found = false;
		for ( int i = 0; i < qty ; i++ ) {
			if ( search == boxId[i] ) {
				System.out.println( "This stock: " + boxStock[i] );
				found = true;
				break;
			}
			
		}
		
		if ( found == false ) {
			System.out.println( "Product " + search + " not found" );
		}

	}

}
