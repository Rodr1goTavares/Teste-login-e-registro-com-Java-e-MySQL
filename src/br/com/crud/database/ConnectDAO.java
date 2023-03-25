package br.com.crud.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDAO {
	
	public static Connection ConnectDB() {
		Connection cnctDB = connectDatabase();
		return cnctDB;
	}
	
	
	private static Connection connectDatabase() {
		Connection connection = null;	
		try {
			//import driver 
			String driverMySQL =  "com.mysql.cj.jdbc.Driver";
			Class.forName(driverMySQL);
			
			final String DATABASE_URL = "jdbc:mysql://yourIp:3306/your-database";
			final String USER = "database user";
			final String PASS = "database password";
			
			//Connect database
			connection =  DriverManager.getConnection(DATABASE_URL, USER, PASS);
			
			//Test connection
            if(connection == null){
            	System.out.println("STATUS---> Connection failed");
            }
            
            System.out.println("STATUS---> Connected to database");
            return connection;
		}
		catch(SQLException | ClassNotFoundException error) {
			System.out.println("A error has occurred (br.com.crudi.database) " +  error);
			return connection = null;
		}
	}
}