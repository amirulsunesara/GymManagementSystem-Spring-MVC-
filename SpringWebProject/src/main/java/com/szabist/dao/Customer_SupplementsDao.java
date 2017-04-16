package com.szabist.dao;

import java.util.List;

import com.szabist.model.Customer_Supplements;


public interface Customer_SupplementsDao {
	public void add(Customer_Supplements customer_supplements);
	public List<Customer_Supplements> getsupplements();
	public List<Customer_Supplements> getonesupplements();
	public void edit(Customer_Supplements customer_supplements);
	public void delete(String id);
}
