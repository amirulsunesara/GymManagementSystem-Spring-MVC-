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
@NamedQuery(name="Employee.getemployee",
    query="SELECT e FROM Employee e"),
@NamedQuery(name="Employee.getoneEmployee ",query="SELECT e FROM Employee e WHERE e.id = :id")
})
public class Employee {

@Id
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private String id;
@Column
private String firstname;
@Column
private String lastname;
@Column
private String designation;
@Column
private String contact;
@Column
private String salary;
public Employee(){}
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public Employee(String id, String firstname, String lastname, String designation, String contact,
		String salary) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.designation = designation;
	this.contact = contact;
	this.salary = salary;
}



}
