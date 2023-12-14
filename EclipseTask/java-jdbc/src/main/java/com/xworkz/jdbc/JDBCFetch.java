package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFetch {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/interview";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Establishing connection!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select * from location where id=8";
		

		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement state = con.createStatement();
			ResultSet result = state.executeQuery(query);

			if (result.next()) {
				System.out.println("Data is coming");
				System.out.println("Id is:"+result.getInt("id"));
				System.out.println("Name is:"+result.getString("name"));
				System.out.println("City is:"+result.getString("city"));
				System.out.println("State is:"+result.getString("state"));
				System.out.println("Pincode is:"+result.getString("pincode"));

			}
			
			System.out.println("connection is successful!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
