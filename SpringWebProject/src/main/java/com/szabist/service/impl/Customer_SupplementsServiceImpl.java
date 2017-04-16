package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szabist.dao.Customer_SupplementsDao;
import com.szabist.model.Customer_Supplements;
import com.szabist.service.Customer_SupplementsService;

@Service
public class Customer_SupplementsServiceImpl implements Customer_SupplementsService {

	@Autowired
	private Customer_SupplementsDao dao;
	
	@Override
	public void add(Customer_Supplements customer_supplements) {
		dao.add(customer_supplements);

	}

	@Override
	public List<Customer_Supplements> getCustomer_Supplements() {
		return dao.getsupplements();
	}

	@Override
	public void edit(Customer_Supplements Customer_Supplements) {
		dao.edit(Customer_Supplements);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public List<Customer_Supplements> getoneCustomer_Supplements() {
		return dao.getonesupplements();	}

}
