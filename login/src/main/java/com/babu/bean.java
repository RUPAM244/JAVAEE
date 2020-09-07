package com.babu;

public class bean 
{
   String name;
   String lname;
   String cour;
   String phone;
   String email;
   String pas;
   
  

public bean(String name, String lname, String cour, String phone, String email, String pas) {
	super();
	this.name = name;
	this.lname = lname;
	this.cour = cour;
	this.phone = phone;
	this.email = email;
	this.pas = pas;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getCour() {
	return cour;
}
public void setCour(String cour) {
	this.cour = cour;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPas() {
	return pas;
}
public void setPas(String pas) {
	this.pas = pas;
}
   
   
@Override
public String toString() {
	return "bean [name=" + name + ", lname=" + lname + ", cour=" + cour + ", phone=" + phone + ", email=" + email
			+ ", pas=" + pas + "]";
}
}
