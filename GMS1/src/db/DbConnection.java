package db;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DbConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "password");

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Driver not loaded Successfully...");
			e.printStackTrace();
		}

		return connection;
	}

}