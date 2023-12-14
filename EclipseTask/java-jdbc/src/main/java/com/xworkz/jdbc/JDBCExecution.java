package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecution {

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
		String query="insert into location(id,name,city,state,pincode)values(1,"+"'"+"rajajingar"+"'"+","+"'"+"banglore"+"'"+","+"'"+"karnataka"+"'"+",577004)";
		String query1="insert into location(id,name,city,state,pincode)values(2,'vijaynagar','banglore','karnataka',566001)";
		String query2="insert into location(id,name,city,state,pincode)values(3,'jaynagar','banglore','karnataka',566410)";
		String query3="insert into location(id,name,city,state,pincode)values(4,'manjunath nagar','banglore','karnataka',566434)";
		String query4="insert into location(id,name,city,state,pincode)values(5,'jp nagar','banglore','karnataka',566412)";
		String query5="insert into location(id,name,city,state,pincode)values(6,'banshankari','banglore','karnataka',564410)";
		String query6="insert into location(id,name,city,state,pincode)values(7,'btm layout','banglore','karnataka',567600)";
		String query7="insert into location(id,name,city,state,pincode)values(8,'kormangla','banglore','karnataka',596410)";
		String query8="insert into location(id,name,city,state,pincode)values(9,'mg road','banglore','karnataka',596410)";
		String query9="insert into location(id,name,city,state,pincode)values(10,'silk board','banglore','karnataka',666410)";
		String updateQuery="update location set city='BANGLORE' where id=1";
		String deleteQuery="delete from location where id=9";
		
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement state=con.createStatement();
//			state.execute(query);
//			state.execute(query1);
//			state.execute(query2);
//			state.execute(query3);
//			state.execute(query4);
//			state.execute(query5);
//			state.execute(query6);
//			state.execute(query7);
//			state.execute(query8);
//			state.execute(query9);
			state.executeUpdate(deleteQuery);
			//state.executeUpdate(updateQuery);
			
			System.out.println("Connection is succesfull!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
