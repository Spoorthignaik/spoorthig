package com.xworkz.examples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "valentine_details")
public class ValentineEntity {

	@Id
	@Column(name="v_id")
	private int id;
	@Column(name="v_name")
	private String name;
	@Column(name="v_valentine_name")
	private String valentineName;
	@Column(name="v_place")
	private  String place;
	@Column(name="v_gift")
	private String gift;
	
	public ValentineEntity() {
		System.out.println("running ValentineEntity");
	}
	
	public ValentineEntity(int id, String name, String valentineName, String place, String gift) {
		super();
		this.id = id;
		this.name = name;
		this.valentineName = valentineName;
		this.place = place;
		this.gift = gift;
	}


	@Override
	public String toString() {
		return "ValentineEntity [id=" + id + ", name=" + name + ", valentineName=" + valentineName + ", place=" + place
				+ ", gift=" + gift + "]";
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getValentineName() {
		return valentineName;
	}


	public String getPlace() {
		return place;
	}


	public String getGift() {
		return gift;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setValentineName(String valentineName) {
		this.valentineName = valentineName;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public void setGift(String gift) {
		this.gift = gift;
	}
	
	
	
	
}
