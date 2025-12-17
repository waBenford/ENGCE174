package javaLab4.lab4_3;
import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "1/2: " );
		int mode = getValue.nextInt();
		getValue.nextLine();
		
		if( mode == 1 ) {
			Player player = new Player();
			player.displayProfile();
		}else if( mode == 2 ) {
			System.out.print( "Username: " );
			String name = getValue.nextLine();
			System.out.print( "Level: " );
			int level = getValue.nextInt();
			Player player = new Player( name, level );
			player.displayProfile();
		}
	}

}

class Player {
	private String username;
	private int level;
	
	public Player() {			//constructor
		this.username = "Guest";
		this.level = 1;
	}
	
	public Player( String name, int level ) {			//constructor
		this.username = name;
		this.level = level;
	}
	
	public void displayProfile() {			//display
		System.out.println( "User: " + this.username + ", Level: " + this.level );
	}
}