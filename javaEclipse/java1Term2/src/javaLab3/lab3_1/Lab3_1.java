package javaLab3.lab3_1;
import java.util.Scanner;

public class Lab3_1 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "User Name: " );
		String name = getValue.nextLine();
		
		User user = new User( name );
		
		System.out.println( user.getUsername() );
	}

}

class User {
	private String userName;
	
	public String getUsername() { return this.userName; }
	
	public User( String user ) {
		this.userName = user;
	}
}
