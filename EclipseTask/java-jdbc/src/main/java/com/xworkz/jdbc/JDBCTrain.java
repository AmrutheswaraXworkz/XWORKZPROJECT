package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTrain {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/interview";
		String userName = "root";
		String password = "Xworkzodc@123";

		try {
			Class.forName("com.mysql.jdbc.Driver");// step 1 ; Load and register Query
			System.out.println("Establish Connection....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection conn = null;
		ResultSet rs = null;

		// String insertQuery = "insert into interview values(?,?,?,?,?)";// INSERT
		// Query

		String updateQuery = "Update training set traineeName=? where refNo=?";
		String select = "select * from training";

		try {
			conn = DriverManager.getConnection(jdbcUrl, userName, password);// step 2;Establish connection
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setInt(2, 3);
			pstmt.setString(1, "Shreekruthi");

			pstmt.execute();

			pstmt.setInt(2, 4);
			pstmt.setString(1, "Sampreeth");

			pstmt.execute();

			pstmt.setInt(2, 5);
			pstmt.setString(1, "Vinod");

			pstmt.execute();

			pstmt.setInt(2, 6);
			pstmt.setString(1, "Hemadri");

			pstmt.execute();

			pstmt.setInt(2, 7);
			pstmt.setString(1, "Drashan");
			pstmt.execute();
			rs = pstmt.executeQuery(select);
			while (rs.next()) {
				System.out.println("Ref Number is:" + rs.getInt("refNo"));
				System.out.println("Trainer Name:" + rs.getString("trainerName"));
				System.out.println("Trainee Name:" + rs.getString("traineeName"));
				System.out.println("Location is:" + rs.getString("location"));
				System.out.println("Fee:" + rs.getInt("fee"));
				System.out.println("++++++++++++++++++++++");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			System.out.println("Finally Block...");

			if (conn != null) {
				try {
					conn.close(); //
					System.out.println("Closing Connection.......");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close(); //
					System.out.println("Closing Result Set.......");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}