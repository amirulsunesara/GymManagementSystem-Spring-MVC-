package com.szabist.service;

import java.util.List;

import com.szabist.model.Trainer;

public interface TrainerService {
	public void add(Trainer trainer);
	public List<Trainer> getTrainer();
	public void edit(Trainer trainer);
	public void delete(String id);
	public Trainer getoneTrainer(String id);


}
