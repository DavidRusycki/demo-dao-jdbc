package application;

import java.util.Date;
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
		
		System.out.println("=== Test 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> listFromDepartment = sellerDao.findByDepartment(department);
		for (Seller seller : listFromDepartment) {
			System.out.println(seller);
		}
		
		System.out.println("=== Test 3: seller findAll ===");
		List<Seller> listFromAll = sellerDao.findAll();
		for (Seller seller : listFromAll) {
			System.out.println(seller);
		}
		
		System.out.println("=== Test 4: seller insert ===");
		Seller seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(seller);
		System.out.println(seller);
		
		System.out.println("=== Test 5: seller update ===");
		Seller findedSeller = sellerDao.findById(1);
		findedSeller.setName("Martha Waine");
		sellerDao.update(findedSeller);
		System.out.println(findedSeller);
		
		System.out.println("=== Test 6: seller delete ===");
		sellerDao.deleteById(20);
		
	}
	
}
