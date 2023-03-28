package br.com.crud;

import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);
	
	public static void start() {
		System.out.println("Welcome to the crud app, try: \n'R' to register \n'L' to login");
		String userChose = scanner.nextLine();
		
		if(userChose.equals("L") || userChose.equals("l")) {
			loginMenu();
		}
		else if (userChose.equals("R") || userChose.equals("r")) {
			registerMenu();
		}
	}
	
	private static void loginMenu(){
		System.out.println("<< Login >>");
		
		System.out.println("User: ");
		String user = scanner.nextLine();
		
		System.out.println("Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Logging...");
		Login.verifyLogin(user.trim(), email.trim());
	}
	
	private static void registerMenu() {
		Scanner scn = new Scanner(System.in);
		System.out.println("<< Register >>");
			
		System.out.println("User:");
		String user = scn.nextLine();
			
		System.out.println("Email:");
		String email = scn.nextLine();
			
		scanner.close();
			
		try {
			Register.createAccount(user.trim(), email.trim());
		}
		catch (Exception err) {
			System.out.println("A error has occourred (br.com.crudi.App)" +  err);
		}
	}
}
