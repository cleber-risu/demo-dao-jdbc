package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("\nTest 1: Insert department");
		Department newDepartment = new Department(null, "D3");
		departmentDao.insert(newDepartment);
		System.out.println("Department created! Id: " + newDepartment.getId());
		*/
		
		/*
		System.out.println("\nTest 2: update department");
		Department editDepatment = new Department(13, "Update name Department");
		departmentDao.update(editDepatment);
		System.out.println("Update completed!");
		*/
		
		/*
		System.out.println("\nTest 3: delete department");
		departmentDao.deleteById(13);
		System.out.println("Delete completed!");
		*/
		
		/*
		System.out.println("\nTest 4: find by id - department");
		Department searchId = departmentDao.findById(10);
		System.out.println(searchId);
		*/
		
		System.out.println("\nTest 5: find all - department");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
	}

}
