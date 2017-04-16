package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.SupplementsDao;
import com.szabist.model.Supplements;
import com.szabist.service.SupplementsService;

@Service
public class SupplementsServiceImpl implements SupplementsService {

	@Autowired 
	private SupplementsDao dao;
	
	
	@Override
	@Transactional
	public void add(Supplements supplements) {
		dao.add(supplements);

	}

	@Override
	public List<Supplements> getSupplements() {
		return dao.getsupplements();
	}

	@Override
	@Transactional
	public void edit(Supplements supplements) {
		dao.edit(supplements);

	}

	@Override
	@Transactional
	public void delete(String id) {
		dao.delete(id);

	}

	@Override
	public Supplements getoneSupplements(String id) {
		return dao.getonesupplements(id);
	}

}
