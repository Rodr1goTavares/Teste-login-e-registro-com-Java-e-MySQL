package br.com.crudi;

import java.util.Random;

import br.com.crudi.database.AccountModel;
import br.com.crudi.database.ConnectDAO;

public class Register {

	public static void createAccount(String user, String email) {
		try {
			AccountModel account = new AccountModel();
			account.setId(generateId());
			account.setUser(user);
			account.setEmail(email);
			
			ConnectDAO data = new ConnectDAO();
			data.insertAccount(account);			
		}
		catch (Exception error) {
			System.out.println("Failed to insertAccount in ConnectDAO" + error);
		}
	}
	
	private static int generateId() {
		Random random = new Random();
		int id = random.nextInt(1000);
		return id;
	}
}
