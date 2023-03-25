package br.com.crud.operations;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.crud.database.AccountModel;
import br.com.crud.database.ConnectDAO;

public class Create {
	public static void insertAccount(AccountModel account) {
	
		int id = account.getId();
		String username = account.getUser();
		String email = account.getEmail();
		
		try {
			String sql = "INSERT INTO accounts (id, username, email) VALUES (?, ?, ?)";
			PreparedStatement statement = ConnectDAO.ConnectDB().prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, username);
			statement.setString(3, email);
			statement.execute();
			
			System.out.println("Register successfully !!");
		}
		catch(SQLException error){
			System.out.println("A error has occurred to insert user in database: " + error);
		}
	}
}

