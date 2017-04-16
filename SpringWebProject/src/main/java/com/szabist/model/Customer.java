package com.szabist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@Entity
@NamedQueries({
@NamedQuery(name="Customer.getcustomer",
    query="SELECT e FROM Customer e"),
@NamedQuery(name="Customer.getoneCustomer ",query="SELECT e FROM Customer e WHERE e.id = :id")
})
public class Customer {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String fee;

	
	public Customer(){}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getFee() {
		return fee;
	}


	public void setFee(String fee) {
		this.fee = fee;
	}


	public Customer(String id, String firstname, String lastname, String fee) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fee = fee;
	}
	
	
	
}
