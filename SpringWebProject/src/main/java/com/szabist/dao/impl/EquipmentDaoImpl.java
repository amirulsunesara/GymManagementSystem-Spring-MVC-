package com.szabist.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.szabist.dao.EquipmentDao;
import com.szabist.model.Equipment;
import com.szabist.model.Supplements;

@Repository
public class EquipmentDaoImpl implements EquipmentDao {

	 @PersistenceContext
	 private EntityManager entityManager;
	
	@Override
	public void add(Equipment equipment) {
		entityManager.persist(equipment);

	}

	@Override
	public List<Equipment> getEquipment() {
		return entityManager.createNamedQuery("Equipment.getEquipment", Equipment.class).getResultList();
		
	}

	@Override
	public void edit(Equipment equipment) {
		entityManager.merge(equipment);
	}

	@Override
	public void delete(String id) {
		Equipment s = entityManager.find(Equipment.class, id);
		entityManager.remove(entityManager.merge(s));

	}

	@Override
	public Equipment getoneequipment(String id) {
		return entityManager.find(Equipment.class, new String(id));
		
	}

}
