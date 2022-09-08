package dbodbo;
//aaa
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbotest {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        System.out.println("hello");
    	String connectionUrl =
                "jdbc:sqlserver://WIN-Q4FDHDUP7DV;"
                        + "database=testovaci;"
                        + "user=student;"
                        + "password=heslo123;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";

    	 ResultSet resultSet = null;
    	 
    	 	
    	 
    	    try (Connection connection = DriverManager.getConnection(connectionUrl);
                    Statement statement = connection.createStatement();) {
            // Create and execute a SELECT SQL statement.
            String selectSql = "INSERT into osoba (jmeno, prijmeni, pohlavi) VALUES ('Dominik', 'Duka', 'Letadlo')";
            statement.executeUpdate(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
            
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("bye");
    }
}
