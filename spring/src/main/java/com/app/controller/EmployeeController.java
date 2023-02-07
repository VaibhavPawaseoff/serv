package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Services.EmployeeService;
import com.app.pojos.Employee;



@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		
	}
	
	@PostMapping
	public Employee saveEmployee(@org.springframework.web.bind.annotation.RequestBody Employee emp)
	{
		System.out.println("Emp details "+emp+"   "+emp.getSalary());
		return empService.addEmployee(emp);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmp()
	{
		return empService.getAllEmployee();
		
	}
	
	@GetMapping("/{empid}")
	public Employee fetchId(@PathVariable Long empid)
	{
		return empService.getEmployeeById(empid);
	   	
	}
	
	@DeleteMapping("/{empid}")
	public String DeleteId(@PathVariable Long empid)
	{
		return empService.deleteEmpId(empid);
	}
	
	@PutMapping
	public Employee updateEmp(@RequestBody Employee emp)
	{
		return empService.updateByEmployee(emp);
	}
	
}
