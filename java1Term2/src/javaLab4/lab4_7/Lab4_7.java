package javaLab4.lab4_7;
import java.util.Scanner;

public class Lab4_7 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "ID." );
		String id1 = getValue.nextLine();
		String id2 = getValue.nextLine();
		String id3 = getValue.nextLine();
		
		Resource resource_1 = new Resource( id1 );
		Resource resource_2 = new Resource( id2 );
		Resource resource_3 = new Resource( id3 );
		
		resource_1 = null;
		resource_2 = null;
		System.gc();
		
		resource_3 = null;
		System.gc();
		
		try { Thread.sleep(1000); } 
		catch (InterruptedException e) { }
	}

}

class Resource {
	private String id;
	
	public Resource( String id ) {
		this.id = id;
		System.out.println( "Resource " + this.id + " created." );
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println( "Resource " + this.id + "  fanalized (destroyed)." );
	}
}