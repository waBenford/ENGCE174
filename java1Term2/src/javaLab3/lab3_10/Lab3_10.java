package javaLab3.lab3_10;
import java.util.Scanner;

public class Lab3_10 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Quantity: " );
		int qty =  getValue.nextInt();
		getValue.nextLine(); 
		
		for( int i = 0; i < qty; i++ ) {
			String SoL = getValue.nextLine(); 
			
			if( SoL.equals( "SET" ) ) {
				int newLog = getValue.nextInt();
				getValue.nextLine(); 
				SystemLogger.setLogLevel(newLog);
				
			}else if( SoL.equals( "LOG" ) ) {
				int newSet = getValue.nextInt();
				getValue.nextLine(); 
				
				String messageContent = getValue.nextLine(); 
				SystemLogger.log(newSet, messageContent);
				
			}
		}
		getValue.close();
	}

}

class SystemLogger {
	private static int currentLogLevel = 1;
	
	private static String getLevelName( int level ) {
		if( level == 1 ) { return "INFO"; }
		else if( level == 2 ) { return "DEBUG"; }
		else if( level == 3 ) { return "ERROR"; }
		else { return "UNKNOWN"; }
	}
	
	public static void setLogLevel( int newLevel ) {
		if( newLevel >= 1 && newLevel <= 3 ) {
			currentLogLevel = newLevel;
			System.out.println( "Log level set to " + getLevelName(newLevel) );
		}else {
			System.out.println( "Invalid log level." );
		}
	}
	
	public static void log( int messageLevel, String message ) {
		if( messageLevel >= currentLogLevel ) { 
			String level = getLevelName(messageLevel);
			System.out.println( "[" + level + "]: " + message ); 
		}
	}
}