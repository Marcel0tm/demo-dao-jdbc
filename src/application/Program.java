package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dp = new Department(1, "Cars");
		
		
		Seller seller = new Seller(21, "Bob G.", "bob@gmail.com", new Date(), 3000.00, dp);
	
		System.out.println(seller);
	}
}