package app;

import java.util.List;

import model.dao.DaoFactore;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("TESTE1 find by id");
		
		
		SellerDao sellerDao = DaoFactore.createSellerDao();

		Seller seller = sellerDao.findById(3);
		//Seller seller = new Seller(21, "Donalt", "doonal@gmail.com", new Date(), 3000.0, department);
		
		
		System.out.println(seller);

		
		System.out.println("TESTE2 find by department");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("TESTE3 findAll");
		 list = sellerDao.findAll();
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
	}

}
