package com.contact.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	
	@Id
	@GeneratedValue
	private int dasid;	
	
	private String name;
	private String email;
	private String contactNumber;
	public Contact(String name, String email, String contactNumber) {
		super();
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public Contact() {
		super();
	}
	public int getDasid() {
		return dasid;
	}
	public void setDasid(int dasid) {
		this.dasid = dasid;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact [dasid=" + dasid + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ "]";
	}
	
	
	
}

	