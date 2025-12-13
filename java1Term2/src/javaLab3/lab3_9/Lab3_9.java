package javaLab3.lab3_9;
import java.util.Scanner;

public class Lab3_9 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "minLength 1: " );
		int minLength1 = getValue.nextInt();
		getValue.nextLine();
		
		System.out.print( "User Name 1: " );
		String user1_name = getValue.nextLine();
		
		System.out.print( "Password: " );
		String user1_pass = getValue.nextLine();
		
		System.out.print( "User Name 2: " );
		String user2_name = getValue.nextLine();
		
		System.out.print( "Password: " );
		String user2_pass = getValue.nextLine();
		
		System.out.print( "minLength 2: " );
		int minLength2 = getValue.nextInt();
		getValue.nextLine();
		
		System.out.print( "New password: " );
		String user2_newPass = getValue.nextLine();
				
		User.setMinLength(minLength1);
		
		User user1 = new User( user1_name, user1_pass );
		User user2 = new User( user2_name, user2_pass );
		
		User.setMinLength(minLength2);
		
		user2.setPassword(user2_newPass);
		
		System.out.println( user1.getPassword() );
		System.out.println( user2.getPassword() );
	}

}

class User {
	private String name;
	private String password;
	private static int minPasswordLength = 8;
	
	public User( String user, String password ) {
		this.name = user;
		
		if( password.length() >= minPasswordLength ) {
			this.password = password;
			System.out.println( "Creation seccessful." );
		}else {
			this.password = "invalid";
			System.out.println( "Creation failed." );
		}
	}
	
	public static int getMinLength() { return minPasswordLength; } //getter
	
	public static void setMinLength( int length ) { //setter
		if( length >= 4 ) {
			minPasswordLength = length;
			System.out.println( "New min length set to " + length );
		}else {
			System.out.println( "invaild length." );
		}
	}
	
	public String getPassword() { return this.password; }
	
	public void setPassword( String newPassword ) {
		if( newPassword.length() >= minPasswordLength ) {
			this.password = newPassword;
			System.out.println( "Update successful." );
		}else {
			System.out.println( "Update failed." );
		}
	}
}
