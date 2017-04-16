package com.szabist.service;

import java.util.List;

import com.szabist.model.Customer;

public interface CustomerService {
	public void add(Customer customer);
	public List<Customer> getcustomer();
	public void edit(Customer customer);
	public void delete(String id);
	public Customer getonecustomer(String id);
}
