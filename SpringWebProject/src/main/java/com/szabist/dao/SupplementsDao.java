package com.szabist.dao;

import java.util.List;

import com.szabist.model.Supplements;

public interface SupplementsDao {
public void add(Supplements suplements);
public List<Supplements> getsupplements();
public Supplements getonesupplements(String id);
public void edit(Supplements supplements);
public void delete(String id);
	

	}



