package com.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.OrderService;
import com.model.Orders;
import com.model.Product;
import com.model.User;

public class OrderManagement {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		OrderService os = new OrderService();

		while (true) {
			System.out.println("********************Order Management********************");
			System.out.println("Press 1. To create an order");
			System.out.println("Press 2. To cancel an order");
			System.out.println("Press 3. To create a product");
			System.out.println("Press 4. To create a user");
			System.out.println("Press 5. To get all product details");
			System.out.println("Press 6. To get all order details of a particular user by id");
			System.out.println("Press 0. TO EXIT");
			System.out.println("************************************************");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("EXITING.......THANK YOU!!!!");
				break;
			}

			switch (input) {
			case 1:
				System.out.println("**********Creating Order**********");
				System.out.println("Are you a new user?\n1.yes\n2.no");
				int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Enter your new Username: ");
					sc.nextLine();
					String username = sc.nextLine();
					System.out.println("Enter your new Password: ");
					String password = sc.nextLine();
					String role = "User";
					User user = new User(username, password, role);
					System.out.println(user);
					try {
						os.createUser(user);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Continuing with the order placement ");
				System.out.println("Enter User id: ");
				int userId = sc.nextInt();
				System.out.println("****Enter the product details****");
				System.out.println("Enter Product id: ");
				int id = sc.nextInt();
				System.out.println("Enter product Name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.println("Enter user name:");
				String username = sc.nextLine();

				os.createOrder(id, userId, productName, username);
				break;
			case 2:
				System.out.println("***********Order Cancellation***********");
				System.out.println("Enter user ID: ");
				int userid = sc.nextInt();
				System.out.println("Enter Order ID: ");
				int orderid = sc.nextInt();

				os.cancelOrder(userid, orderid);
				break;
			case 3:
				System.out.println("**********Product Creation**********");
				System.out.println("Enter the user ID: ");
				int rolecheck = sc.nextInt();
				String role = os.checkRole(rolecheck);
				if (role.equals("Admin")) {
					System.out.println("YOU MAY PROCEED");
					System.out.println("Enter the product Details below");
					System.out.println("Enter the product Name: ");
					sc.nextLine();
					String pname = sc.nextLine();
					System.out.println("Enter the product Description: ");
					String pdescribe = sc.nextLine();
					System.out.println("Enter the product Price: ");
					double pprice = sc.nextDouble();
					System.out.println("Enter the product Quantity in Stock: ");
					int pqos = sc.nextInt();
					System.out.println("Enter the product Type (Electronic/Clothing): ");
					sc.nextLine();
					String ptype = sc.nextLine();
					
					Product proinsertion = new Product(pname,pdescribe,pprice,pqos,ptype);
					os.createProduct(proinsertion);
				} else
					System.out.println("User who are not admin cannot add Products");
				break;
			case 4:
				System.out.println("********Creating New User********");
				System.out.println("Enter your new Username: ");
				sc.nextLine();
				String userName = sc.nextLine();
				System.out.println("Enter your new Password: ");
				String password = sc.nextLine();
				String roles = "User";
				User user = new User(userName, password, roles);
				try {
					os.createUser(user);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("********Display all Product Details********");
				List<Product> prod = os.getAllProducts();
				for (Product l : prod)
					System.out.println(l);
				break;
			case 6:
				System.out.println("**********Order Details By ID**********");
				System.out.println("Enter your ID: ");
				int id1 = sc.nextInt();
				List<Orders> uid = os.getAllOrder(id1);
				for (Orders l : uid)
					System.out.println(l);
				break;
			default:
				break;
			}
		}
	}
}
