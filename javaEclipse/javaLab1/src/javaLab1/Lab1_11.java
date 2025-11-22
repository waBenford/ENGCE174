package javaLab1;
import java.util.Scanner;
import java.util.Arrays;

public class Lab1_11 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		int[] arrQty = new int[qty];
		
		for (int i = 0; i < qty; i++) {
			System.out.print( "" );
			arrQty[i] = getValue.nextInt();
		}
		
		int sum = sumArray(arrQty);
		System.out.println( "sum: " + sum );

	}
	
	public static int sumArray( int[] numbers ) {
		int sum = Arrays.stream( numbers ).sum(); 
		return sum;
	}//ส่ง arrayNumbers เข้าไปในท่อ(Stream) แล้วสั่งให้ท่อนั้นบวก(sum) ค่าทั้งหมดออกมา
	 //สั่งให้คลาส Arrays เรียกใช้เมทอด stream() โดยใช้ numbers เป็นวัตถุดิบ

}
