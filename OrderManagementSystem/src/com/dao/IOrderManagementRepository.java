package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Product;
import com.model.User;

public interface IOrderManagementRepository {

	public void createUser(User user) throws SQLException;

	public List<Product> getAllProducts() throws SQLException;

}
