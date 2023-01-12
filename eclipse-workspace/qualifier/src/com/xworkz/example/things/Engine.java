package com.xworkz.example.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNumber")
	private double number;
	@Autowired
	@Qualifier("engineVersion")
	private String version;
	private String company;
	private int strokes;

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type, double number,
			String version, @Qualifier("engineCompany") String company, int strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getNumber() {
		return number;
	}

	public String getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	public int getStrokes() {
		return strokes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Autowired
	@Qualifier("engineStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

}
