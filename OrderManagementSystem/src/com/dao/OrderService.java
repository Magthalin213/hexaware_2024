package com.dao;

import java.sql.SQLException;
import java.util.List;

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
}
