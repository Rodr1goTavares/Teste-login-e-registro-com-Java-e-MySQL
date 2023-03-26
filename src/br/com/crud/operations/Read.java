package br.com.crud.operations;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.crud.database.ConnectDAO;

public class Read {
	public static boolean checkAccount(String user, String email){
		try {
		    String sql = "SELECT username, email FROM account WHERE username = ? AND email = ?";
		    PreparedStatement statement = ConnectDAO.ConnectDB().prepareStatement(sql);
		    statement.setString(1, user);
		    statement.setString(2, email);
		    statement.execute();
 			return true;
		} 
		catch (SQLException error) {
			System.out.println("Failed to find acocunt in database");
			return false;
		}
	}
}
