package com.xworkz.example.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewsPaper {
	
	@Autowired
	@Qualifier("idNo")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("language1")
	private String language;
	private double price;
	
	public NewsPaper() {
		System.out.println("running news papaer");
	}
	
	@Autowired
	public NewsPaper(int id,@Qualifier("newsPaperName") String name, @Qualifier("ownerName1")String ownerName, String language, double price) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.language = language;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLanguage() {
		return language;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Autowired
	@Qualifier("price1")
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
