package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("=== Teste 1: Department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		departmentDao.findById(1);
		System.out.println(departmentDao.findById(1));
		
		System.out.println("=== Teste 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("=== Teste 3: Department insert ===");
		Department forInsert = new Department(null, "Academic");
		departmentDao.insert(forInsert);
		System.out.println(forInsert);
		
		System.out.println("=== Teste 4: Department update ===");
		Department forUpdate = new Department(6, "E-Books");
		departmentDao.update(forUpdate);
		System.out.println(forUpdate);
	
		System.out.println("=== Teste 5: Department delete ===");
		departmentDao.deleteById(7);
		departmentDao.deleteById(8);
		departmentDao.deleteById(9);
		System.out.println("Deleted!");
		
	}

}
