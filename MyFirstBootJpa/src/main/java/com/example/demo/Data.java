package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data
{
@Id
String name;
String address;
String city;



public Data()
{
	
}

public Data(String name, String address, String city) {
	super();
	this.name = name;
	this.address = address;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

	
	
}
