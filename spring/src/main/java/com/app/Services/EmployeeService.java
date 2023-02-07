package com.app.Services;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	Employee addEmployee(Employee emp);
	Employee getEmployeeById(Long id);
	String deleteEmpId(Long empid);
	Employee updateByEmployee(Employee emp);
	

}
