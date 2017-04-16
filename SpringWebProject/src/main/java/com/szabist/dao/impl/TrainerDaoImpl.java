package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.szabist.dao.TrainerDao;
import com.szabist.model.Employee;
import com.szabist.model.Trainer;

@Repository
public class TrainerDaoImpl implements TrainerDao {

	@PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Trainer trainer) {
		entityManager.persist(trainer);
		//System.out.println(trainer.getTrainer_style());
	}

	@Override
	public List<Trainer> getTrainer() {
		return entityManager.createNamedQuery("Trainer.getTrainer", Trainer.class).getResultList();
	}

	@Override
	public Trainer getoneTrainer(String id) {
		return entityManager.find(Trainer.class, new String(id));
//		return query.getResultList();
	}

	@Override
	public void edit(Trainer trainers) {
		entityManager.merge(trainers);

	}

	@Override
	public void delete(String id) {
		Trainer s = entityManager.find(Trainer.class, id);
		entityManager.remove(entityManager.merge(s));

	}

}
