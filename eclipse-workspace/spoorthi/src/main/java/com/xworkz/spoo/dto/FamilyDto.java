package com.xworkz.spoo.dto;

public class FamilyDto {
	
	private String familyName;
	private int noOfMembers;
    private int noOfChildrens;
    private int noOfYouths;
    private boolean happyFamily;
    private String familyHead;
    private int age;
    private boolean  good;
    private boolean educated;
    private String nameOfHouse;
    
    public FamilyDto() {
		System.out.println("running family dto");
	}
    
    
	public FamilyDto(String familyName, int noOfMembers, int noOfChildrens, int noOfYouths, boolean happyFamily,
			String familyHead, int age, boolean good, boolean educated, String nameOfHouse) {
		super();
		this.familyName = familyName;
		this.noOfMembers = noOfMembers;
		this.noOfChildrens = noOfChildrens;
		this.noOfYouths = noOfYouths;
		this.happyFamily = happyFamily;
		this.familyHead = familyHead;
		this.age = age;
		this.good = good;
		this.educated = educated;
		this.nameOfHouse = nameOfHouse;
	}


	@Override
	public String toString() {
		return "FamilyDto [familyName=" + familyName + ", noOfMembers=" + noOfMembers + ", noOfChildrens="
				+ noOfChildrens + ", noOfYouths=" + noOfYouths + ", happyFamily=" + happyFamily + ", familyHead="
				+ familyHead + ", age=" + age + ", good=" + good + ", educated=" + educated + ", nameOfHouse="
				+ nameOfHouse + "]";
	}


	public String getFamilyName() {
		return familyName;
	}


	public int getNoOfMembers() {
		return noOfMembers;
	}


	public int getNoOfChildrens() {
		return noOfChildrens;
	}


	public int getNoOfYouths() {
		return noOfYouths;
	}


	public boolean isHappyFamily() {
		return happyFamily;
	}


	public String getFamilyHead() {
		return familyHead;
	}


	public int getAge() {
		return age;
	}


	public boolean isGood() {
		return good;
	}


	public boolean isEducated() {
		return educated;
	}


	public String getNameOfHouse() {
		return nameOfHouse;
	}


	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}


	public void setNoOfChildrens(int noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}


	public void setNoOfYouths(int noOfYouths) {
		this.noOfYouths = noOfYouths;
	}


	public void setHappyFamily(boolean happyFamily) {
		this.happyFamily = happyFamily;
	}


	public void setFamilyHead(String familyHead) {
		this.familyHead = familyHead;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setGood(boolean good) {
		this.good = good;
	}


	public void setEducated(boolean educated) {
		this.educated = educated;
	}


	public void setNameOfHouse(String nameOfHouse) {
		this.nameOfHouse = nameOfHouse;
	}
	
	
    

}
