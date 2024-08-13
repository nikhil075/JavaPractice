package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
	private static final String URL=  "jdbc:mysql://localhost:3306/TCS_DB";
	private static final String USER=  "root";
	private static final String PASSWORD= "Root123$";
	
	public static Connection getConnection() throws SQLException { 
		return DriverManager.getConnection (URL, USER, PASSWORD);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try (Connection connection = getConnection()) { 
				if (connection != null) {
					System.out.println("Connected to the database!");
				}
			}

catch (SQLException e) {
	e.printStackTrace();
}

}}

