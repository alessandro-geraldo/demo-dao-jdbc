package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("++++++++++ teste 1, Insert +++++++++++++");
		Department department = new Department(null, "Brinquedos");
		departmentDao.insert(department);
		System.out.println("inserted new id= " + department.getId());
		
		System.out.println("++++++++++ teste 2, Update +++++++++++++");
		Department newDepartment = new Department(null, "Alimentos");
		newDepartment = departmentDao.findById(1);
		newDepartment.setName("moveis");
		departmentDao.update(newDepartment);
		System.out.println("update complete");
				
	    System.out.println("++++++++++ teste 3, findById +++++++++++++");
		department = departmentDao.findById(1);
		System.out.println(department);
				
		System.out.println("++++++++++ teste 4, findAll +++++++++++++");
	    List<Department> list = departmentDao.findAll();
	    for(Department dep: list) {
	    	System.out.println(dep);
	    }
		
		

	}

}
