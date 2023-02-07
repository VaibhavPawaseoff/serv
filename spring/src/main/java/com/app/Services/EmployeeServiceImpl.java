package com.app.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exception.ResourceNotFoundException;
import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}


	@Override
	public Employee addEmployee(Employee emp) {
	
		return empRepo.save(emp);
	}


	
	@Override
	public Employee getEmployeeById(Long empId) {
		return empRepo.findById(empId).orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID !!!!!"));
	}


	@Override
	public String deleteEmpId(Long empid) {
		Employee e=empRepo.findById(empid).orElseThrow(()-> new ResourceNotFoundException("Invalid Id"));
		empRepo.delete(e);
		return "okiee";
	}


	@Override
	public Employee updateByEmployee(Employee emp) {
		
		if(empRepo.existsById(emp.getId()))
		{
			empRepo.save(emp);
		}
		return null;
	}
	

	
	

}
