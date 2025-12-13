package javaLab3.lab3_3;
import java.util.Scanner;

public class Lab3_3 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Old Password: " );
		String oldPass = getValue.nextLine();
		
		System.out.print( "New Password:" );
		String newPass = getValue.nextLine();
		
		User user = new User( oldPass );
		user.setPassword(newPass);
		
		System.out.println( user.getPassword() );
	}

}

class User {
	private String password;
	
	public String getPassword() { return this.password; }
	
	public void setPassword( String newPassword ) { 
		int len = newPassword.length();
		
		if ( len >= 8 ) {
			this.password = newPassword;
			System.out.println( "Password Updated." );
		}else {
			System.out.println( "Password is too short." );
		}
	}
	
	public User ( String pass ) {
		this.password = pass;
	}
	
}
