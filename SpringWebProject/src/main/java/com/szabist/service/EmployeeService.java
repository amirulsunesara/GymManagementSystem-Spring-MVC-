package com.szabist.service;

import java.util.List;

import com.szabist.model.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public List<Employee> getemployee();
	public void edit(Employee employee);
	public void delete(String id);
	public Employee getoneEmployee(String id);

}
