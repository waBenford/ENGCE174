package javaLab4.lab4_4;
import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Start Latitude and Longitude." );
		double lat = getValue.nextDouble();
		double lon = getValue.nextDouble();
		System.out.println( "New Latitude." );
		double newLat = getValue.nextDouble();
		
		Location location1 = new Location( lat, lon );
		Location location2 = new Location( location1 );
		
		location1.setLatitude(newLat);
		
		location1.displayInfo();
		location2.displayInfo();
	}

}

class Location {
	private double latitude;
	private double longitude;
	
	public Location( double latitude, double longitude ) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Location( Location other ) {
		this.latitude = other.latitude;
		this.longitude = other.longitude;
	}
	
	public void setLatitude( double newLat ) {
		this.latitude = newLat;
	}
	
	public void displayInfo() {
		System.out.println( "Lat: " + this.latitude + ", Lon: " + this.longitude );
	}
}