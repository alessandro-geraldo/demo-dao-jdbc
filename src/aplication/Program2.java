package aplication;

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
		
		
		
		
		

	}

}
