package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Orders;
import com.model.Product;
import com.model.User;

public interface IOrderManagementRepository {

	public void createUser(User user) throws SQLException;

	public List<Product> getAllProducts() throws SQLException;

	public List<Orders> getAllOrder(int id) throws SQLException;

	public void createOrder(int id, int userId, String productName, String username) throws SQLException;

}
