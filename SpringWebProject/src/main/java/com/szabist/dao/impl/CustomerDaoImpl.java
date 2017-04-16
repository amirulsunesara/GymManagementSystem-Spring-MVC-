package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.szabist.dao.CustomerDao;
import com.szabist.model.Customer;
import com.szabist.model.Customer_Supplements;
import com.szabist.model.Supplements;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Customer customer) {
		entityManager.persist(customer);

	}

	@Override
	public List<Customer> getcustomer() {
		return entityManager.createNamedQuery("Customer.getcustomer", Customer.class).getResultList();

	}

	@Override
	public Customer getonecustomer(String id) {
		return entityManager.find(Customer.class, new String(id));

	}

	@Override
	public void edit(Customer customer) {
		entityManager.merge(customer);

	}

	@Override
	public void delete(String id) {
		Customer s = entityManager.find(Customer.class, id);
		entityManager.remove(entityManager.merge(s));

	}

}
