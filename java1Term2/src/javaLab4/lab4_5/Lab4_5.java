package javaLab4.lab4_5;
import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.println( "Input RGB." );
		int r = getValue.nextInt();
		int g = getValue.nextInt();
		int b = getValue.nextInt();
		
		Color color = new Color( r, g, b );
		color.displayRGB();
	}

}

class Color {
	private int red, green, blue;
	
	public Color( int r, int g, int b ) {			//constructor
		if( r >= 0 && r <= 255 ) this.red = r;
		else if( r < 0 ) this.red = 0;
		else if( r> 255 ) this.red = 255;
		
		if( g >= 0 && g <= 255 ) this.green = g;
		else if( g < 0 ) this.green = 0;
		else if( g > 255 ) this.green = 255;
		
		if( b >= 0 && b <= 255 ) this.blue = b;
		else if( b < 0 ) this.blue = 0;
		else if( b > 255 ) this.blue = 255;
	}
	
	public int getRed() { return this.red; }			//getter
	public int getGreen() { return this.green; }
	public int getBrue() { return this.blue; }
	
	public void displayRGB() {							//display
		System.out.println( "R=" + this.red + ", G=" + this.green + ", Blue=" + this.blue );
	}
}