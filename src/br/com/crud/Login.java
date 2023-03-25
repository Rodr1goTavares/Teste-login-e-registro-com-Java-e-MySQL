package br.com.crud;

import br.com.crud.database.ConnectDAO;

public class Login {
	public static void verifyLogin(String user, String email) {
		try {
			ConnectDAO login = new ConnectDAO();
			boolean LoginCheck = login.readAccount(user, email);
			
			if(!LoginCheck) {
				System.out.println("User or email incorrect");
				return;
			}
			
			startLogin();
		}
		catch (Exception error) {
			System.out.println("A error has occurred to verify login: " +  error);
		}
	}

	private static void startLogin() {
		
	}
	
}

