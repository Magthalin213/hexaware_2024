package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Orders;
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

	@Override
	public List<Orders> getAllOrder(int id) throws SQLException {
		List<Orders> list = new ArrayList<>();
		Connection conn=DBUtil.getDBConn();
		String sql = "select * from orders where user_id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rst = pstmt.executeQuery();
		while (rst.next()) { 
			int pid = rst.getInt("product_id");
			int uid = rst.getInt("user_id");
			int oid = rst.getInt("orders_id");
			String pname = rst.getString("product_name");
			String uname = rst.getString("user_name");
			Orders orders = new Orders(pid, uid, oid, pname, uname);
			list.add(orders);
		}
		DBUtil.dbClose();
		return list;
	}

	@Override
	public void createOrder(int id, int userId, String productName, String username) throws SQLException {
		Connection conn=DBUtil.getDBConn();
		String sql = "INSERT INTO orders(product_id,user_id,product_name,user_name) VALUES(?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setInt(2, userId);
		pstmt.setString(3, productName);
		pstmt.setString(4,username);
		int changes=pstmt.executeUpdate();
		if(changes==0)
			System.out.println("Error....No updates have been done");
		else
			System.out.println("New Order has been placed succesfully...");
		DBUtil.dbClose();
	}
	
}
