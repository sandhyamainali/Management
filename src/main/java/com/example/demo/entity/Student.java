package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
private String fname;
private String lname;
@Id
private int id;

private String address;
private String email;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String course;
private String gender;
private String dateofbirth;

public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

}

