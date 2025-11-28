package javaLab1;
import java.util.Scanner;

public class Lab1_13 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		int row, column;
		System.out.print( "Row and Column(Space): " );
		row = getValue.nextInt();
		column = getValue.nextInt();
		int[][] arrays = new int[row][column];
		
		int online = 0;
		for ( int i = 0; i < row; i++ ) {
			
			for ( int z = 0; z < column; z++ ) {
				System.out.print( "" );
				arrays[i][z] = getValue.nextInt();
				if ( arrays[i][z] == 1 ) {
					online += 1;
				}
			}
			
		}
		
		System.out.println( "Online: " + online );
			
		}
		
	}
