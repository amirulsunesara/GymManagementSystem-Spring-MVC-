package com.szabist.dao;

import java.util.List;

import com.szabist.model.Customer;


public interface CustomerDao {
	public void add(Customer customer);
	public List<Customer> getcustomer();
	public Customer getonecustomer(String id);
	public void edit(Customer customer);
	
	public void delete(String id);
}
