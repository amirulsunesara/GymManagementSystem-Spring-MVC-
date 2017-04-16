package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.TrainerDao;
import com.szabist.model.Trainer;
import com.szabist.service.TrainerService;
@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	private TrainerDao dao;

	@Override
	@Transactional
	public void add(Trainer trainer) {
		dao.add(trainer);
		
	}

	@Override
	public List<Trainer> getTrainer() {
		return dao.getTrainer();
	}

	@Override
	@Transactional
	public void edit(Trainer trainer) {
		dao.edit(trainer);
		
	}

	@Override
	@Transactional
	public void delete(String id) {
		dao.delete(id);
		
	}

	@Override
	public Trainer getoneTrainer(String id) {
		return dao.getoneTrainer(id);
	}
	
	
	
}
