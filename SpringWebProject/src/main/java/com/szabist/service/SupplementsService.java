package com.szabist.service;

import java.util.List;

import com.szabist.model.Supplements;

public interface SupplementsService {

	public void add(Supplements supplements);
	public List<Supplements> getSupplements();
	public void edit(Supplements supplements);
	public void delete(String id);
	public Supplements getoneSupplements(String id);


}
