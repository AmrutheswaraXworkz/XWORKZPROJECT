package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllJDBC {

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

		String select = "select * from location";
		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		try {
			con = DriverManager.getConnection(jdbcUrl, userName, password);
			state = con.createStatement();
			result = state.executeQuery(select);

			System.out.println(result.next());
			while (result.next()) {
				System.out.println("Data is fetching");
				System.out.println("Id is:" + result.getInt("id"));
				System.out.println("Name is:" + result.getString("name"));
				System.out.println("City is:" + result.getString("city"));
				System.out.println("State is:" + result.getString("state"));
				System.out.println("Pincode is:" + result.getString("pincode"));
				System.out.println("+++++++++++++++++++++++++");

			}
			System.out.println(result.next());
			System.out.println("Connection is successful!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("Closing costly resources!!!");
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (state != null) {
				try {
					state.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (result != null) {
				try {
					result.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
