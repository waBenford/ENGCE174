package javaLab3.lab3_15;
import java.util.Scanner;

class User {
	private String username;
	private int failedAttempts = 0;
	private boolean isLocked = false;
	private static int maxAttempts = 3;
	
	public User(String username) {
		this.username = username;
	}
	
	public static void setPolicy(int max) {
		if (max > 0) {
			maxAttempts = max;
			System.out.println("Policy updated.");
		} else {
			System.out.println("Invalid policy.");
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	
	public void login(String password) {
		if (isLocked) {
			System.out.println("Account is locked.");
			return;
		}
		
		// สมมติรหัสผ่านที่ถูกต้องคือ "pass123"
		if (password.equals("pass123")) {
			failedAttempts = 0;
			System.out.println("Login successful.");
		} else {
			failedAttempts++;
			
			if (failedAttempts >= maxAttempts) {
				isLocked = true;
				System.out.println("Login failed. Account locked.");
			} else {
				int attemptsLeft = maxAttempts - failedAttempts;
				System.out.println("Login failed. " + attemptsLeft + " attempts left.");
			}
		}
	}
}

public class Lab3_15 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Your Name: " );
		String username = getValue.nextLine();
		User user = new User(username);
		
		int N = getValue.nextInt();
		getValue.nextLine();

		for (int i = 0; i < N; i++) {
			String command = getValue.nextLine();
			
			if (command.equals("SET_POLICY")) {
				int max = getValue.nextInt();
				getValue.nextLine(); 
				User.setPolicy(max);
				
			} else if (command.equals("LOGIN")) {
				String password = getValue.nextLine();
				user.login(password);
			}
		}
		
		getValue.close();
	}
}