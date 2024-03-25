package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.model.Lease;
import com.model.Product;
import com.model.User;
import com.util.DBUtil;

public class OrderProcessor implements IOrderManagementRepository {

	@Override
	public void createUser(User user) throws SQLException {
		Connection conn=DBUtil.getDBConn();
		String sql = "INSERT INTO user(username,password,role) VALUES(?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		String userName= user.getUsername();
		String password=user.getPassword();
		String role=user.getRole();
		pstmt.setString(1, userName);
		pstmt.setString(2, password);
		pstmt.setString(3, role);
		int changes=pstmt.executeUpdate();
		if(changes==0)
			System.out.println("Error....No updates have been done");
		else
			System.out.println("New User has been Inserted succesfully...");
		System.out.println("User ID: "+user.getUserId()+"\nUserName: "+userName+"\npassword: "+password+"\nRole: "+role);
		DBUtil.dbClose();
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		List<Product> list = new ArrayList<>();
		Connection conn=DBUtil.getDBConn();
		String sql = "select * from product";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		while (rst.next()) {
			int id = rst.getInt("id");
			String productName = rst.getString("product_name");
			String description = rst.getString("description");
			int price = rst.getInt("price");
			int quantity= rst.getInt("quantity_in_stock");
			String type = rst.getString("type");
			Product p = new Product(id,productName,description,price,quantity,type);
			list.add(p);
		}
		DBUtil.dbClose();
		return list;
	}
	
}
