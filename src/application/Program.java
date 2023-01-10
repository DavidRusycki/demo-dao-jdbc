package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== Test 1: seller findById ===");
		Seller test = sellerDao.findById(3);
		System.out.println(test);
		
		System.out.println("=== Test @: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> listFromDepartment = sellerDao.findByDepartment(department);
		for (Seller seller : listFromDepartment) {
			System.out.println(seller);
		}
		
	}
	
}
