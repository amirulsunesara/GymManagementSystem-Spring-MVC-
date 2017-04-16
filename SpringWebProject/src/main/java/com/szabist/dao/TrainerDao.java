package com.szabist.dao;

import java.util.List;

import com.szabist.model.Trainer;


public interface TrainerDao {
	public void add(Trainer trainer);
	public List<Trainer> getTrainer();
	public Trainer getoneTrainer(String id);
	public void edit(Trainer trainer);
	public void delete(String id);
		
}
