package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.szabist.dao.SupplementsDao;
import com.szabist.model.Customer;
import com.szabist.model.Employee;
import com.szabist.model.Supplements;
import com.szabist.model.Trainer;

@Repository
public class SupplementsDaoImpl implements SupplementsDao {

	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Supplements suplements) {
		entityManager.persist(suplements);

	}

	@Override
	public List<Supplements> getsupplements() {
		return entityManager.createNamedQuery("Supplements.getSupplements", Supplements.class).getResultList();
	}

	@Override
	public Supplements getonesupplements(String id) {
		return entityManager.find(Supplements.class, new String(id));
	}

	@Override
	public void edit(Supplements supplements) {
		entityManager.merge(supplements);

	}

	@Override
	public void delete(String id) {
		Supplements s = entityManager.find(Supplements.class, id);
		entityManager.remove(entityManager.merge(s));

	}

}
