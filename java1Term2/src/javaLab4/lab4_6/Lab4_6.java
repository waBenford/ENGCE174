package javaLab4.lab4_6;
import java.util.Scanner;

public class Lab4_6 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Start x/y: " );
		int x = getValue.nextInt();
		int y = getValue.nextInt();
		System.out.println( "New Point x/y: " );
		int dx = getValue.nextInt();
		int dy = getValue.nextInt();
		
		Point p1 = new Point( x, y );
		Point p2 = p1.move(dx, dy);
		Point p3 = p2.move(dx, dy);
		
		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
	}

}

class Point {
	private final int x;
	private final int y;
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	
	public Point( int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public Point move( int dx, int dy ) {
		int newX = this.x + dx;
		int newY = this.y + dy;
		return new Point( newX, newY );
	}
	
	public void displayInfo() {
		System.out.println( "(" + this.x + ", " + this.y + ")" );
	}
}