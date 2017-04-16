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
@NamedQuery(name="Supplements.getSupplements",
    query="SELECT e FROM Supplements e"),
@NamedQuery(name="Supplements.getoneSupplements ",query="SELECT e FROM Supplements e WHERE e.id = :id")
})
public class Supplements {

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
@Column
private String stock;


public Supplements(){}


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


public String getStock() {
	return stock;
}


public void setStock(String stock) {
	this.stock = stock;
}


public Supplements(String id, String item_name, String manufacturer_name, String supplier_name, String cost, String stock) {
	super();
	this.id = id;
	this.item_name = item_name;
	this.manufacturer_name = manufacturer_name;
	this.supplier_name = supplier_name;
	this.cost = cost;
	this.stock = stock;
}




}










