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
@NamedQuery(name="Equipment.getEquipment",
    query="SELECT e FROM Equipment e"),
@NamedQuery(name="Equipment.getoneEquipment ",query="SELECT e FROM Equipment e WHERE e.id = :id")
})
public class Equipment {	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	@Column
	private String item_name;
	
	@Column
	private String manufacturer_name;
	
	@Column
	private String supplier_name;
	
	@Column
	private String cost;
	

	public Equipment(){}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getManufacturer_name() {
		return manufacturer_name;
	}


	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}


	public String getSupplier_name() {
		return supplier_name;
	}


	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}


	public Equipment(String id, String item_name, String manufacturer_name, String supplier_name, String cost) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.manufacturer_name = manufacturer_name;
		this.supplier_name = supplier_name;
		this.cost = cost;
	}		
	
}
