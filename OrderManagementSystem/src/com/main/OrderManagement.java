package com.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.OrderService;
import com.model.Product;
import com.model.User;

public class OrderManagement {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		OrderService os = new OrderService();
		
		while(true)
		{
			System.out.println("********************Order Management********************");
			System.out.println("Press 1. To create an order");
			System.out.println("Press 2. To cancel an order");
			System.out.println("Press 3. To create a product");
			System.out.println("Press 4. To create a user");
			System.out.println("Press 5. To get all product details");
			System.out.println("Press 6. To get all order details of a particular user by id");
			System.out.println("Press 0. TO EXIT");
			System.out.println("************************************************");
			int input=sc.nextInt();
			
			if(input==0)
			{
				System.out.println("EXITING.......THANK YOU!!!!");
				break;
			}
			
			switch(input)
			{
			case 1:
				System.out.println("**********Creating Order**********");
				System.out.println("Are you a new user?\n1.yes\n2.no");
				int choice=sc.nextInt();
				if(choice == 1)
				{
					System.out.println("Enter your new Username: ");
					sc.nextLine();
					String username=sc.nextLine();
					System.out.println("Enter your new Password: ");
					String password=sc.nextLine();
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
				int userId=sc.nextInt();
				System.out.println("****Enter the product details****\nEnter product Name: ");
				String productName = sc.nextLine();
				System.out.println("Enter product description: ");
				String description =sc.nextLine();
				System.out.println("Enter the price: ");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("********Display all Product Details********");
				List<Product> prod=os.getAllProducts();
				for( Product l: prod)
					System.out.println(l);os.getAllProducts();
				break;
			case 6:
				break;
			default:
				break;
			}
	}
	}
}
