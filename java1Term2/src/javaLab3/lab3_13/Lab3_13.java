package javaLab3.lab3_13;
import java.util.Scanner;

class LicenseManager {
	private static int maxLicenses = 10;
	private static int usedLicenses = 0;
	
	public static void setMax(int max) {
		if (max > 0 && max <= usedLicenses) {
			System.out.println("Cannot set max lower than current usage.");
		} else if (max > 0) {
			maxLicenses = max;
			System.out.println("Max licenses set to " + max);
		} else {
			System.out.println("Invalid max value.");
		}
	}
	
	public static boolean checkOut() {
		if (usedLicenses < maxLicenses) {
			usedLicenses++;
			System.out.println("Checkout successful.");
			return true;
		} else {
			System.out.println("Checkout failed: No licenses available.");
			return false;
		}
	}
	
	public static void checkIn() {
		if (usedLicenses > 0) {
			usedLicenses--;
			System.out.println("Check-in successful.");
		} else {
			System.out.println("Nothing to check-in.");
		}
	}
	
	public static void displayStatus() {
		System.out.println("Used: " + usedLicenses);
		System.out.println("Available: " + (maxLicenses - usedLicenses));
	}
}

public class Lab3_13 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine(); 

		for (int i = 0; i < qty; i++) {
			String command = getValue.nextLine();
			
			if (command.equals("SET")) {
				int max = getValue.nextInt();
				getValue.nextLine(); 
				LicenseManager.setMax(max);
				
			} else if (command.equals("CHECKOUT")) {
				LicenseManager.checkOut();
				
			} else if (command.equals("CHECKIN")) {
				LicenseManager.checkIn();
				
			} else if (command.equals("STATUS")) {
				LicenseManager.displayStatus();
			}
		}
		
		getValue.close();
	}
}