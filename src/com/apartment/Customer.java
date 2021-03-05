package com.apartment;

public class Customer {
private int id;
private String name,email,age,password;
private int rent,paid,due;
private String address,gender,state,flatno,contactno;


public Customer() {}

public Customer(String name,String password, String email, String age, int rent, int paid, int due, String address, String gender,
		String state, String flatno, String contactno) {
	super();
	this.name = name;
	this.password=password;
	this.email = email;
	this.age = age;
	this.rent = rent;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.gender = gender;
	this.state = state;
	this.flatno = flatno;
	this.contactno = contactno;
}

public Customer(int id, String name,String password, String email, String age, int rent, int paid, int due, String address,
		String gender, String state, String flatno, String contactno) {
	super();
	this.id = id;
	this.name = name;
	this.password=password;
	this.email = email;
	this.age = age;
	this.rent = rent;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.gender = gender;
	this.state = state;
	this.flatno = flatno;
	this.contactno = contactno;
}

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getage() {
	return age;
}
public String getpassword() {
	return password;
}
public void setage(String age) {
	this.age = age;
}
public void setpassword(String password) {
	this.password = password;
}
public int getrent() {
	return rent;
}
public void setrent(int rent) {
	this.rent = rent;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getDue() {
	return due;
}
public void setDue(int due) {
	this.due = due;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getgender() {
	return gender;
}
public void setgender(String gender) {
	this.gender = gender;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getflatno() {
	return flatno;
}
public void setflatno(String flatno) {
	this.flatno = flatno;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

}
