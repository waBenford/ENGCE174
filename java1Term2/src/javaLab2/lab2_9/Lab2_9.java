package javaLab2.lab2_9;
import java.util.Scanner;

public class Lab2_9 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Name: " );
		String name = getValue.nextLine();
		
		System.out.print( "Street: " );
		String str = getValue.nextLine();
		
		System.out.print( "City: " );
		String city = getValue.nextLine();
		
		System.out.print( "Zip Code: " );
		String zip = getValue.nextLine();
		
		Address address = new Address( str, city, zip );
		Student student = new Student( name, address );
		
		System.out.println( student.displayProfile() );
	}

}

class Address {
	private String street;
	private String city;
	private String zipCode;
	
	public String getStreet() { return this.street; }
	public String getCity() { return this.city; }
	public String getZipCode() { return this.zipCode; }
	
	public void setStreet( String getStr ) { this.street = getStr; }
	public void setCity( String getCt ) { this.city = getCt; }
	public void setZipCode( String getZc ) { this.zipCode = getZc; }

	public Address( String str, String city, String zip ) {
		this.street = str;
		this.city = city;
		this.zipCode = zip;
	}
	
	public String getFullAddress() {
		String fullAddress = this.street + ", " + this.city + ", " + this.zipCode;
		return fullAddress;
	}
}

class Student {
	private String name;
	private Address address;
	
	public String getName() { return this.name; }
	public Address getAddress() { return this.address; }
	
	public void setName( String setN ) { this.name = setN; }
	public void setAddress( Address setA ) { this.address = setA; }
	
	public Student( String N, Address A ) {
		this.name = N;
		this.address = A;
	}
	
	public String displayProfile() {
		String display = "Name: " + this.name + "\nAddress: " + this.address.getFullAddress();
		return display;
	}
}