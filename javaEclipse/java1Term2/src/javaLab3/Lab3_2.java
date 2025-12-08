package javaLab3;
import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Initial Score: " );
		int score = getValue.nextInt();
		
		System.out.print( "Update Score: " );
		int newScore = getValue.nextInt();
		
		Player player = new Player( score );
		player.setScore(newScore);
		
		System.out.println( player.getScore() );
	}

}

class Player {
	private int score;
	
	public int getScore() { return this.score; }
	
	public void setScore( int newScore ) { this.score = newScore; }
	
	public Player( int initialScore ) {
		this.score = initialScore;
	}
}
