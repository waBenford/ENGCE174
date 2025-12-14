package javaLab3.lab3_11;
import java.util.Scanner;

class SystemConfig {
	private static SystemConfig instance;
	private String serverUrl;
	private int maxConnections;
	
	private SystemConfig() {
		this.serverUrl = "default.server.com";
		this.maxConnections = 10;
	}
	
	public static SystemConfig getInstance() {
		if(instance == null) {
			instance = new SystemConfig();
		}
		return instance;
	}
	
	public String getServerUrl() {
		return serverUrl;
	}
	
	public void setServerUrl(String url) {
		this.serverUrl = url;
	}
	
	public int getMaxConnections() {
		return maxConnections;
	}
	
	public void setMaxConnections(int count) {
		if(count > 0) {
			this.maxConnections = count;
			System.out.println("Max connections set.");
		} else {
			System.out.println("Invalid count.");
		}
	}
}

public class Lab3_11 {

	public static void main(String[] args) {
		Scanner getValue = new Scanner( System.in );
		
		System.out.print( "Quantity: " );
		int qty = getValue.nextInt();
		getValue.nextLine();

		for (int i = 0; i < qty; i++) {
			String command = getValue.nextLine();
			
			SystemConfig config = SystemConfig.getInstance(); 

			if (command.equals("SET_URL")) {
				String newUrl = getValue.nextLine();
				config.setServerUrl(newUrl);
				
			} else if (command.equals("SET_MAX")) {
				int newMax = getValue.nextInt();
				getValue.nextLine();
				config.setMaxConnections(newMax);
				
			} else if (command.equals("SHOW")) {
				System.out.println("URL: " + config.getServerUrl());
				System.out.println("MAX: " + config.getMaxConnections());
			}
		}
		
		getValue.close();
	}
}