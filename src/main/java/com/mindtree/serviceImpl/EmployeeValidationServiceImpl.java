package com.mindtree.serviceImpl;

import com.mindtree.daoImpl.EmployeeValidationDaoImpl;
import com.mindtree.entity.EmployeeValidation;
import com.mindtree.service.EmployeeValidationService;

public class EmployeeValidationServiceImpl implements EmployeeValidationService {

	@Override
	public String addCredentials(EmployeeValidation emp1) {
		EmployeeValidationDaoImpl ed = new EmployeeValidationDaoImpl();
		return ed.addCredentials(emp1);
	}

	@Override
	public EmployeeValidation fcredentials(String sname) {
		EmployeeValidationDaoImpl ed = new EmployeeValidationDaoImpl();
		return ed.fcredentials(sname);
	}

	@Override
	public String UpdatePassword(String name, String password) {
		EmployeeValidationDaoImpl ed = new EmployeeValidationDaoImpl();
		return ed.UpdatePassword(name, password);
	}

}
