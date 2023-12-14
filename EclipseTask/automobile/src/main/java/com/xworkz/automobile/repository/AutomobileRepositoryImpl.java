package com.xworkz.automobile.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.dto.AutomobileDTO;

public class AutomobileRepositoryImpl implements AutomobileRepository {

	public AutomobileRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

//	public void saveVehicle(List<AutomobileDTO> list) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String url = "jdbc:mysql://localhost:3306/automobile";
//		String userName = "root";
//		String password = "Xworkzodc@123";
//		String query = "insert into vehicle(name,color,type,model)values(?,?,?,?);";
//
//		try {
//			Connection con = DriverManager.getConnection(url, userName, password);
//			PreparedStatement ps = con.prepareStatement(query);
//			
//			
//			
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	@Override
	public void saveVehicle(AutomobileDTO automobileDTO) {

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		String url = "jdbc:mysql://localhost:3306/automobile";
//		String userName = "root";
//		String password = "Xworkzodc@123";
//		String query = "insert into vehicle(name,color,type,model)values(?,?,?,?);";
//
//		try {
//			Connection con = DriverManager.getConnection(url, userName, password);
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setString(1, automobileDTO.getName());
//			ps.setString(2, automobileDTO.getColor());
//			ps.setString(3, automobileDTO.getType());
//			ps.setInt(4, automobileDTO.getModel());
//			ps.execute();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void saveList(List<AutomobileDTO> list) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "insert into vehicle(name,color,type,model)values(?,?,?,?);";

		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement ps = con.prepareStatement(query);
			for (AutomobileDTO automobileDTO : list) {
				ps.setString(1, automobileDTO.getName());
				ps.setString(2, automobileDTO.getColor());
				ps.setString(3, automobileDTO.getType());
				ps.setInt(4, automobileDTO.getModel());
				ps.execute();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateVehicleByName(List<AutomobileDTO> list) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String queryUpdate = "update vehicle set color=?,model=? where name=?";
		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			PreparedStatement ps = con.prepareStatement(queryUpdate);
			AutomobileDTO auto=new AutomobileDTO();
			ps.setString(1,auto.getColor());
			ps.setInt(2, auto.getModel());
			ps.setString(3, auto.getName());
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<AutomobileDTO> fetchAllVehicles() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String fetchAll = "select * from vehicle";
		List<AutomobileDTO> list = new ArrayList<AutomobileDTO>();

		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			PreparedStatement ps = connection.prepareStatement(fetchAll);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("color"));
//				System.out.println(rs.getString("type"));
//				System.out.println(rs.getString("model"));
//				System.out.println("++++++++++++++++++++");
				AutomobileDTO dto = new AutomobileDTO();
				dto.setName(rs.getString("name"));
				dto.setColor(rs.getString("color"));
				dto.setType(rs.getString("type"));
				dto.setModel(rs.getInt(5));
				list.add(dto);
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
