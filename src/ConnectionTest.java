// Kevin Shibuya Borges CB3005674

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().getConnection();
         System.out.println("Connected");
         connection.close();
     }
}