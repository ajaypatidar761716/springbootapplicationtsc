package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="mytable")
public class User 
{
	@Id
  private int id;
  private String firstname;
  private String lastname;
  private int age;
  private String address;
  
  
public User(String firstname, String lastname, int age, String address) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", address="
			+ address + "]";
}
  
}
