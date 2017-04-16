package com.szabist.service;

import java.util.List;

import com.szabist.model.Customer_Supplements;

public interface Customer_SupplementsService {

		public void add(Customer_Supplements customer_supplements);
		public List<Customer_Supplements> getCustomer_Supplements();
		public void edit(Customer_Supplements Customer_Supplements);
		public void delete(String id);
		public List<Customer_Supplements> getoneCustomer_Supplements();
	

}
