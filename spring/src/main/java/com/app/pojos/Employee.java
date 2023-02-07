package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "Emp")
public class Employee extends BaseEntity{

	@Column(length=20)
	private String name;
	@Column(length=20)
	private String job;
	@Column(name = "Salary")
	private int salary;
	
	
	
	public Employee() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}


	public Employee(String name, String job, int salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	
	
}
