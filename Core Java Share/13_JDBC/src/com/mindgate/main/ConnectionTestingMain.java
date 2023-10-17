package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestingMain {

	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			System.out.println("Step 1. Loading Drivers");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Step 2. Connect Database Server");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "SYSTEM", "Bahubali@010420");
			if(connection!= null) {
				System.out.println("Connected successfully!!");
				connection.close();
				System.out.println("Connection closed!!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed To Load Driver Class");
		} catch (SQLException e) {
			System.out.println("Connection Failed!!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main end");
	}

}
