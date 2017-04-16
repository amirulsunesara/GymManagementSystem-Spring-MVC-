package com.szabist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({
@NamedQuery(name="Customer_Supplements.getCustomer_Supplements",
    query="SELECT e FROM Customer_Supplements e")
})
public class Customer_Supplements {
	@EmbeddedId
	CompositeKey id;
	@Column
	private Date purchased;
	@Column
	private int cost;
	@Column
	private String purchased_from;
	
//	
//	public int getCustomerid() {
//		return customerid;
//	}
//	public void setCustomerid(int customerid) {
//		this.customerid = customerid;
//	}
//	public int getSupplementid() {
//		return supplementid;
//	}
//	public void setSupplementid(int supplementid) {
//		this.supplementid = supplementid;
//	}
	public Date getPurchased() {
		return purchased;
	}
	public void setPurchased(Date purchased) {
		this.purchased = purchased;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPurchased_from() {
		return purchased_from;
	}
	public void setPurchased_from(String purchased_from) {
		this.purchased_from = purchased_from;
	}
	
		
}


