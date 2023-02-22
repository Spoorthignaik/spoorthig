package com.xworkz.examples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeroplane_table")
public class AeroplaneEntity {

	 @Id
	 @Column(name="a_id")
	 private int id;
	 @Column(name="a_company")
	private String company;
	 @Column(name="a_name")
	private String name;
	 @Column(name="a_cost")
	private Long cost;
	 @Column(name="a_type")
	private String type;
	 @Column(name="a_country")
	private String country;
	
	
	
	
	public AeroplaneEntity() {
		System.out.println("running AeroplaneEntity");
	}

	public AeroplaneEntity(String company, String name, Long cost, String type, String country) {
		super();
		this.company = company;
		this.name = name;
		this.cost = cost;
		this.type = type;
		this.country = country;
	}
	
	

	@Override
	public String toString() {
		return "AeroplaneEntity [company=" + company + ", name=" + name + ", cost=" + cost + ", type=" + type
				+ ", country=" + country + "]";
	}
	
	

	public String getCompany() {
		return company;
	}

	public String getName() {
		return name;
	}

	public Long getCost() {
		return cost;
	}

	public String getType() {
		return type;
	}

	public String getCountry() {
		return country;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
