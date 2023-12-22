package application;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	
		System.out.println("=== TEST 1: department insert ====");
		Department newDepartment = new Department(null, "Food");
		
	//	departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New id =" +newDepartment.getId());
		System.out.println();
		
		System.out.println("=== TEST 2: department update ====");
		newDepartment = new Department(2, "Utilities");
		
		departmentDao.update(newDepartment);
		
		System.out.println("Updated!");
		System.out.println();
		
		System.out.println("=== TEST 3: department delete ====");
		
		System.out.println("Enter Department Id to delete: ");
		departmentDao.deleteById(sc.nextInt());
		
		System.out.println("Delete complete!");
		System.out.println();
		
		System.out.println("=== TEST 4: department FindById ====");
		
		System.out.println("Enter Department Id: ");
		Department department = departmentDao.findById(sc.nextInt());
		
		System.out.println(department);
		System.out.println();
		
		System.out.println("=== TEST 5: department FindAll ====");
		
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}		
		
		System.out.println();
		
		sc.close();
	}

}
