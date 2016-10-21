package com.pack2;

import java.util.List;

import com.pack2.Address;
import com.pack2.PhoneNumbers;

public class User {
	private String firstname;
	private String lastname;
	boolean isAlive;
	private Integer age;
	private Address address;
	private List<PhoneNumbers> phoneNumbers;
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public Integer getAge () {
		return age;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public List<PhoneNumbers> getNumber() {
		return phoneNumbers;
		
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
}
