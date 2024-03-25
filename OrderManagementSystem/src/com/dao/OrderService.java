package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Orders;
import com.model.Product;
import com.model.User;

public class OrderService {
	IOrderManagementRepository irmr= new OrderProcessor();

	public void createUser(User user) throws SQLException {
		irmr.createUser(user);
	}

	public List<Product> getAllProducts() throws SQLException {
		return irmr.getAllProducts();
	}

	public List<Orders> getAllOrder(int id) throws SQLException {
		// TODO Auto-generated method stub
		return irmr.getAllOrder(id);
	}

	public void createOrder(int id, int userId, String productName, String username) throws SQLException {
		irmr.createOrder(id,userId,productName,username);
	}
}
