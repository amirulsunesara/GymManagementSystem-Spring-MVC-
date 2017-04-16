package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.EmployeeDao;
import com.szabist.model.Employee;
import com.szabist.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	@Transactional
	public void add(Employee employee) {
		dao.add(employee);

	}

	@Override
	public List<Employee> getemployee() {
		return dao.getemployee();
	}

	@Override
	@Transactional
	public void edit(Employee employee) {
		dao.edit(employee);

	}
	@Transactional
	@Override
	public void delete(String id) {
		System.out.println("Service"+id);
		dao.delete(id);

	}

	@Override
	public Employee getoneEmployee(String id) {
		return dao.getoneemployee(id);
	}

}
