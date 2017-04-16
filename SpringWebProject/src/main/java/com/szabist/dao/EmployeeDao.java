package com.szabist.dao;

import java.util.List;


import com.szabist.model.Employee;

public interface EmployeeDao {

public void add(Employee employee);	
public List<Employee> getemployee();
public Employee getoneemployee(String id);
public void edit(Employee employee);
public void delete(String id);

}

