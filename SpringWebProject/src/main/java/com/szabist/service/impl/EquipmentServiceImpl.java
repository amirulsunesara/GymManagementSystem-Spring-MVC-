package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.EquipmentDao;
import com.szabist.model.Equipment;
import com.szabist.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService{

	@Autowired
	private EquipmentDao dao;
	
	@Override
	@Transactional
	public void add(Equipment equipment) {
		dao.add(equipment);
		
	}

	@Override
	public List<Equipment> getEquipment() {
		return dao.getEquipment();
	}

	@Override
	@Transactional
	public void edit(Equipment equipment) {
		dao.edit(equipment);
		
	}

	@Override
	@Transactional
	public void delete(String id) {
		dao.delete(id);
		
	}

	@Override
	public Equipment getoneequipment(String id) {
		return dao.getoneequipment(id);
	}

}
