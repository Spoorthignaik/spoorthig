package com.xworkz.examples.dto;

public class DaughterDto {
	
	private String name;
	private long mobileNo;
	private int age;
	private boolean committed;
	private boolean alive;
	
	
	public DaughterDto() {
		
	}


	public DaughterDto(String name, long mobileNo, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {		
		return 100;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null) {
			if(obj instanceof DaughterDto) {
				DaughterDto dto=(DaughterDto)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching="+dto.name);
					return true;
				}
			}
		}
		
		return false;
	}


	@Override
	public String toString() {
		return "DaughterDto [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isCommitted() {
		return committed;
	}


	public void setCommitted(boolean committed) {
		this.committed = committed;
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	

}
