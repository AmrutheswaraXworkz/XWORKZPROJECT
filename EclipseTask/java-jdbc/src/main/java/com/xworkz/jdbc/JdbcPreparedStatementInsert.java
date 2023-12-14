package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPreparedStatementInsert {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/interview";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");//static method takes the FNQ of the class called Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String insertQuery = "insert into location(id,name,city,state,pincode) values(?,?,?,?,?)";
		String select = "select * from location";

		Connection con = null;
		PreparedStatement prepare = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(jdbcUrl, userName, password);
			prepare = con.prepareStatement(insertQuery); // write query once and execute as many times
//			prepare.setInt(1, 11);
//			prepare.setString(2, "manglore");
//			prepare.setString(3, "chikmanglore");
//			prepare.setString(4, "karntaka");
//			prepare.setString(5, "577124");
//			prepare.execute();
			prepare.setInt(1, 12);
			prepare.setString(2, "vidyanagar");
			prepare.setString(3, "davangere");
			prepare.setString(4, "karnataka");
			prepare.setString(5, "577004");
			prepare.execute();
			rs = prepare.executeQuery(select);
			while (rs.next()) {
				System.out.println("Id is:" + rs.getInt("id"));
				System.out.println("Name is:" + rs.getString("name"));
				System.out.println("City is:" + rs.getString("city"));
				System.out.println("State is:" + rs.getString("state"));
				System.out.println("Pincode is:" + rs.getString("pincode"));
				System.out.println("++++++++++++++++++++++");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (con != null) {

				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (prepare != null) {

				try {
					prepare.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {

				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
