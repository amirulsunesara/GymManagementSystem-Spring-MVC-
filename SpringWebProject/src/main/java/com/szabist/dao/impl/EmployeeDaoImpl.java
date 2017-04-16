package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.szabist.dao.EmployeeDao;
import com.szabist.model.Employee;
import com.szabist.model.Equipment;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Employee employee) {
		entityManager.persist(employee);

	}

	@Override
	public List<Employee> getemployee() {      
		return entityManager.createNamedQuery("Employee.getemployee", Employee.class).getResultList();
		
	}

	@Override
	public Employee getoneemployee(String id) {
		System.out.println("DAo"+id);
		return entityManager.find(Employee.class,new String(id));
		
	}

	@Override
	public void edit(Employee employee) {
		entityManager.merge(employee);

	}

	@Override
	public void delete(String id) {
		Employee s = entityManager.find(Employee.class, id);
		entityManager.remove(entityManager.merge(s));

	}

}
