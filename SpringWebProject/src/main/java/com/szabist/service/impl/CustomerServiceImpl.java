package com.szabist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szabist.dao.CustomerDao;
import com.szabist.model.Customer;
import com.szabist.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Override
	@Transactional
	public void add(Customer customer) {
		dao.add(customer);
		
	}

	@Override
	
	public List<Customer> getcustomer() {
		return dao.getcustomer();
	}

	@Override
	@Transactional
	public void edit(Customer customer) {
		dao.edit(customer);
		
	}

	@Override
	@Transactional
	public void delete(String id) {
		dao.delete(id);
		
	}

	@Override
	public Customer getonecustomer(String id) {
		return dao.getonecustomer(id);
		
	}
	

}
