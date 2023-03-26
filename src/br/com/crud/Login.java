package br.com.crud;

import br.com.crud.database.ConnectDAO;
import br.com.crud.operations.Read;

public class Login {
	public static void verifyLogin(String user, String email) {
		boolean accountCheck = Read.checkAccount(user, email);
		if(accountCheck){
			startLogin();
		}
		else {
			System.out.println("Username or email icorrect");
		}
	}
	
	private static void startLogin() {
		System.out.println("Loggin successfully");
	}
	
}

