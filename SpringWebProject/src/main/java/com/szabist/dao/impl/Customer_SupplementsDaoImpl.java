package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.szabist.dao.Customer_SupplementsDao;
import com.szabist.model.Customer_Supplements;

@Repository
public class Customer_SupplementsDaoImpl implements Customer_SupplementsDao {

	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Customer_Supplements customer_supplements) {
		entityManager.persist(customer_supplements);

	}

	@Override
	public List<Customer_Supplements> getsupplements() {
		return entityManager.createNamedQuery("Customer_Supplements.getsupplements", Customer_Supplements.class).getResultList();
	}

	@Override
	public List<Customer_Supplements> getonesupplements() {
		return entityManager.createNamedQuery("Customer_Supplements.getonesupplements", Customer_Supplements.class).getResultList();

	}

	@Override
	public void edit(Customer_Supplements customer_supplements) {
		entityManager.merge(customer_supplements);

	}

	@Override
	public void delete(String id) {
		Customer_Supplements s = entityManager.find(Customer_Supplements.class, id);
		entityManager.remove(entityManager.merge(s));

	}

}
