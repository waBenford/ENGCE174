package javaLab1;
import java.util.Scanner;

public class Lab1_14 {

    public static void main(String[] args) {
        Scanner getValue = new Scanner( System.in );
        
        System.out.print( "Rows/Columns: " );
        int rows = getValue.nextInt();
        int column = getValue.nextInt();
        
        char[][] map = new char[rows][column];
        
        System.out.println("Enter map(* or .): ");
        for ( int i = 0; i < rows; i++ ) {
        	
            for ( int j = 0; j < column; j++ ) {
                System.out.print( "" );
                map[i][j] = getValue.next().charAt(0); 
            }
            
        }
        
        System.out.print( "Position: " );
        int targetRow = getValue.nextInt();
        int targetCol = getValue.nextInt();
        
        
        if ( map[targetRow][targetCol] == '*' ) {
            System.out.println( "Mine!" );
        } 
        else { 
            int mineCount = 0;
            int checkR1 = targetRow - 1;
            int checkC1 = targetCol - 1;
            if ( checkR1 >= 0 && checkR1 < rows && checkC1 >= 0 && checkC1 < column ) {
                if ( map[checkR1][checkC1] == '*' ) {
                    mineCount = mineCount + 1;
                }
            }
            
            int checkR2 = targetRow - 1;
            int checkC2 = targetCol;
            if ( checkR2 >= 0 && checkR2 < rows && checkC2 >= 0 && checkC2 < column ) {
                if ( map[checkR2][checkC2] == '*' ) {
                    mineCount = mineCount + 1;
                }
            }
            
            int checkR3 = targetRow - 1;
            int checkC3 = targetCol + 1;
            if ( checkR3 >= 0 && checkR3 < rows && checkC3 >= 0 && checkC3 < column ) {
                if ( map[checkR3][checkC3] == '*' ) {
                    mineCount = mineCount + 1;
                }
            }
            
            for ( int dr = -1; dr <= 1; dr++ ) {
                for ( int dc = -1; dc <= 1; dc++ ) {
                    if ( dr == 0 && dc == 0 ) continue; 
                    
                    int newR = targetRow + dr;
                    int newC = targetCol + dc;
                    
                    if ( newR >= 0 && newR < rows && newC >= 0 && newC < column ) { 
                        if ( map[newR][newC] == '*' ) {
                            mineCount++;
                        }
                    }
                }
            }
            
            System.out.println( "Output: " + mineCount );
        }
        
        getValue.close();
    }
}
