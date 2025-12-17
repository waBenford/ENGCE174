package javaLab4.lab4_1;
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );

		System.out.print( "Mode: " );
		int mode = getValue.nextInt();
		getValue.nextLine();
		
		if( mode == 1 ) {
			String title = getValue.nextLine();
			Book book = new Book( title );
			book.displayinfo();
		}else if( mode == 2 ) {
			String title = getValue.nextLine();
			String author = getValue.nextLine();
			Book book = new Book( title, author );
			book.displayinfo();
		}else {
			System.out.println( "Please only number 1/2." );
		}
		
	}

}

class Book {
	private String title;
	private String author;
	
	public void displayinfo() {
		System.out.println( "Title:" + this.title + ", Author:" + this.author );
	}
	
	public Book( String title ) {
		this.title = title;
		this.author = "Unknown";
	}
	
	public Book( String title, String author ) {
		this.title = title;
		this.author = author;
	} 
}
