// Kevin Shibuya Borges CB3005674

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaConnect {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=alunos";
		String user = "root";
		String password = "1234";

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(url, user, password);				
			}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
	}
}		

