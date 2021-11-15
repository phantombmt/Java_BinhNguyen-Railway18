package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

//	String url="jdbc:mysql://localhost:3306/manageusers?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";
//
//	String url = "jdbc:mysql://localhost:3306/manageusers?autoReconnect=true&useSSL=false&characterEncoding=latin1";
//	String username = "root";
//	String password = "0207antony";
//	String driver = "com.mysql.cj.jdbc.Driver";

	private Properties properties;
	private Connection connection;
	
	public JdbcUtils() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream("src/main/resources/database.properties"));
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection != null && !connection.isClosed()) {
			return connection;
		}
		String url=properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");
		
		Class.forName(driver);
		
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Database connected.");
		
		System.out.print("Your connection : "+ connection);
		System.out.println("\n\n");
		
		return connection;
	}
}
