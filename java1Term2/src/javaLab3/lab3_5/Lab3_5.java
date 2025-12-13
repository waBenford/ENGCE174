package javaLab3.lab3_5;
import java.util.Scanner;

public class Lab3_5 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Server: " );
		String server = getValue.nextLine();
		
		DatabaseConnection nameServer = new DatabaseConnection( server );
		
		nameServer.connect();
		nameServer.disconnect();
		nameServer.disconnect();
		
		System.out.println( nameServer.isConnected() );
	}

}

class DatabaseConnection {
	private String connectionString;
	private boolean connected;
	
	public boolean isConnected() { return this.connected; }
	
	public DatabaseConnection( String connectionString ) {
		this.connectionString = connectionString;
		this.connected = false;
	}
	
	public void connect() {
		if ( this.connected == false ) {
			this.connected = true;
			System.out.println( "Connected to " + this.connectionString );
		}else {
			System.out.println( "Already connected." );
		}
	}
	
	public void disconnect() {
		if ( this.connected == true ) {
			this.connected = false;
			System.out.println( "Disconnected." );
		}else {
			System.out.println( "Already Disconnected." );
		}
	}
}
