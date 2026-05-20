package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Handles SQLite database connection.
 */
public class DatabaseConnection {

   private static final String URL = "jdbc:sqlite:airline.db";
    private static Connection connection = null;
  
    /**
     * Open connection to database
     */
    public static Connection connect() {
        

        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL);
                System.out.println("Database connected successfully");
                System.out.println(System.getProperty("user.dir"));
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }

        return connection;
    }

    /**
     * Close connection
     */
    public static void disconnect() {

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database disconnected!");
            }
        } catch (SQLException e) {
            System.out.println("Close error: " + e.getMessage());
        }
    }
}