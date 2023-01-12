package com.xworkz.example.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Ghost {

	private String name;
	private int age;
	private String gender;
	private int NoOfLegs;
	private int noOfHands;
	private String color;
	private String location;
	private double height;
	private double nailLength;
	private String reasonForDeath;
	@Autowired
	@Qualifier("ghostDressCode")
	private String dressCode;
	@Autowired
	@Qualifier("ghostType")
	private String type;
	@Autowired
	@Qualifier("ghostNoOfKills")
	private int noOfKills;
	@Autowired
	@Qualifier("ghostDateOfBirth")
	private LocalDate dateOfBirth;
	@Autowired
	@Qualifier("ghostDateOfDeath")
	private LocalDate dateOfDeath;
	@Autowired
	@Qualifier("ghostReligion")
	private String religion;
	@Autowired
	@Qualifier("ghostMarried")
	private boolean married;
	@Autowired
	@Qualifier("ghostInnocent")
	private boolean innocent;
	@Autowired
	@Qualifier("ghostHorrible")
	private boolean horrible;
	@Autowired
	@Qualifier("ghostDangerous")
	private boolean dangerous;

	@Autowired
	public Ghost(@Qualifier("ghostName") String name, @Qualifier("ghostAge") int age,
			@Qualifier("ghostGender") String gender, @Qualifier("ghostNoOfLegs") int noOfLegs,
			@Qualifier("ghostNoOfHands") int noOfHands, @Qualifier("ghostColor") String color,
			@Qualifier("ghostLocation") String location, @Qualifier("ghostHeight") double height,
			@Qualifier("ghostNailLength") double nailLength, @Qualifier("ghostReasonForDeath")String reasonForDeath, String dressCode, String type,
			int noOfKills, LocalDate dateOfBirth, LocalDate dateOfDeath, String religion, boolean married,
			boolean innocent, boolean horrible, boolean dangerous) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		NoOfLegs = noOfLegs;
		this.noOfHands = noOfHands;
		this.color = color;
		this.location = location;
		this.height = height;
		this.nailLength = nailLength;
		this.reasonForDeath = reasonForDeath;
		this.dressCode = dressCode;
		this.type = type;
		this.noOfKills = noOfKills;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.religion = religion;
		this.married = married;
		this.innocent = innocent;
		this.horrible = horrible;
		this.dangerous = dangerous;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", age=" + age + ", gender=" + gender + ", NoOfLegs=" + NoOfLegs + ", noOfHands="
				+ noOfHands + ", color=" + color + ", location=" + location + ", height=" + height + ", nailLength="
				+ nailLength + ", reasonForDeath=" + reasonForDeath + ", dressCode=" + dressCode + ", type=" + type
				+ ", noOfKills=" + noOfKills + ", dateOfBirth=" + dateOfBirth + ", dateOfDeath=" + dateOfDeath
				+ ", religion=" + religion + ", married=" + married + ", innocent=" + innocent + ", horrible="
				+ horrible + ", dangerous=" + dangerous + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public int getNoOfLegs() {
		return NoOfLegs;
	}

	public int getNoOfHands() {
		return noOfHands;
	}

	public String getColor() {
		return color;
	}

	public String getLocation() {
		return location;
	}

	public double getHeight() {
		return height;
	}

	public double getNailLength() {
		return nailLength;
	}

	public String getReasonForDeath() {
		return reasonForDeath;
	}

	public String getDressCode() {
		return dressCode;
	}

	public String getType() {
		return type;
	}

	public int getNoOfKills() {
		return noOfKills;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDate getDateOfDeath() {
		return dateOfDeath;
	}

	public String getReligion() {
		return religion;
	}

	public boolean isMarried() {
		return married;
	}

	public boolean isInnocent() {
		return innocent;
	}

	public boolean isHorrible() {
		return horrible;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setNoOfLegs(int noOfLegs) {
		NoOfLegs = noOfLegs;
	}

	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setNailLength(double nailLength) {
		this.nailLength = nailLength;
	}

	public void setReasonForDeath(String reasonForDeath) {
		this.reasonForDeath = reasonForDeath;
	}

	public void setDressCode(String dressCode) {
		this.dressCode = dressCode;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNoOfKills(int noOfKills) {
		this.noOfKills = noOfKills;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfDeath(LocalDate dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setInnocent(boolean innocent) {
		this.innocent = innocent;
	}

	public void setHorrible(boolean horrible) {
		this.horrible = horrible;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

}
