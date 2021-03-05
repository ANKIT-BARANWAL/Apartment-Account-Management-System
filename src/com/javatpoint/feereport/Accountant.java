package com.javatpoint.feereport;

public class Accountant {
private int id;
private String name,password,email,contactno,address,gender,qualification;
public Accountant() {}
public Accountant(String name, String password, String email,String address,String gender,String qualification, String contactno) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.address=address;
	this.gender=gender;
	this.qualification=qualification;
	this.contactno = contactno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setaddress(String address) {
	this.address = address;
}
public void setgender(String gender) {
	this.gender = gender;
}
public void setqualification(String qualification) {
	this.qualification = qualification;
}
public String getaddress() {
	return address;
}
public String getgender() {
	return gender;
}
public String getqualification() {
	return qualification;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

}
