package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

	@Id
	private int id;
	private String name;
	private String address;
	private String phone;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(int id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (address != null ? "address=" + address + ", " : "") + (phone != null ? "phone=" + phone : "") + "]";
	}
	
	
}
