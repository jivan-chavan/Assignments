package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class MyConnection {

	private MyConnection() {
		super();

	}

	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/productdb";
		String username = "root";
		String password = "9860";

		Connection connection = DriverManager.getConnection(url, username, password);

		return connection;
	}
}
