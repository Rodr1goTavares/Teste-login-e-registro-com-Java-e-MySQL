package br.com.crudi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDAO {
	
	public Connection connection = null;
	
	public ConnectDAO() {
		try {
			//import driver 
			String driverMySQL =  "com.mysql.cj.jdbc.Driver";
			Class.forName(driverMySQL);
			
			final String DATABASE_URL = "jdbc:mysql://yourIp:3306/your-database";
			final String USER = "database user";
			final String PASS = "database password";
			
			//Connect database
			this.connection =  DriverManager.getConnection(DATABASE_URL, USER, PASS);
			
			//Test connection
            if(this.connection != null){
                System.out.println("STATUS---> Connected to database");
            } 
            else {
                System.out.println("STATUS---> Connection failed");
            }
		}
		catch(SQLException | ClassNotFoundException error) {
			System.out.println("A error has occurred (br.com.crudi.database) " +  error);
		}
	}
	
	//Create
	public boolean insertAccount(AccountModel account) {
		try{
            String sql = "INSERT INTO accounts (id, username, email) VALUES (?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setInt(1, account.getId());
            statement.setString(2, account.getUser());
            statement.setString(3, account.getEmail());
            statement.execute();

            System.out.println("Register successfully !!!!");
            return true;
        }
        catch(SQLException error){
            System.out.println("A error as ocurred to insert user (br.com.crudi.database.ConnectDAO): " + error);
            return false;
        }
	}
	
	//Read
	public boolean readAccount(String user, String email) {
		try {
			String sql = "SELECT * FROM accounts WHERE user = ?";
			PreparedStatement statement = this.connection.prepareStatement(sql);
			// Incomplete...  
			return false;
		}
		catch(SQLException error) {
			 System.out.println("A error as ocurred to select user (br.com.crudi.database.ConnectDAO): " + error);
	            return false;
		}
	}
	
	//Update
	public boolean updateAccount() {
		return false;
	}
	
	//Delete
	public boolean deleteAccount() {
		return false;
	}
	
	
}
