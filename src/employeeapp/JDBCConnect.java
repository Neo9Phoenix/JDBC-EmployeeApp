package employeeapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnect {
    public static void main(String[] args) {
        Connection connection;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database (empty password)
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "");

            // Create and execute SQL query
            Statement stmt = connection.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM Employees");

            // Print result
            System.out.println("ID\tName\t\t\tPosition");
            System.out.println("--------------------------------------------");
            while (results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                String position = results.getString("position");

                System.out.printf("%d\t%-20s\t%s\n", id, name, position);
            }

            // Clean up
            results.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}
