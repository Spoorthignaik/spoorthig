package com.xworkz.examples.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class HardWareShop {

	
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	private String ownerName;
	@Autowired
	private String address;

	public HardWareShop() {
		System.out.println("created default constructor using spring");
	}

	@Override
	public String toString() {
		return "HardWareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGstNo() {
		return gstNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
