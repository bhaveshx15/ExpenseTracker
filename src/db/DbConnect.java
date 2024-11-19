package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DbConnect {
    public static Connection c;
    public static Statement st;

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Update connection string to allow public key retrieval
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/spendingdb?useSSL=false&allowPublicKeyRetrieval=true", 
                    "root", 
                    "bhavesh$15"
            );
            
            // Create the statement object
            st = c.createStatement();

            System.out.println("Database connected successfully.");

        } catch (ClassNotFoundException ex) {
            System.err.println("Error: Unable to load MySQL JDBC Driver!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.err.println("Database connection failed: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}


