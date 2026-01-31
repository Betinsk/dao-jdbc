package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department department = new Department(1, "books");
		System.out.println(department);
		
		Seller seller = new Seller(21, "Donalt", "doonal@gmail.com", new Date(), 3000.0, department);
		
		System.out.println(seller);

	}

}
