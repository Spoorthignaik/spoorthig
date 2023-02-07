package com.xworkz.spoo.dto;

public class EducationDto {
	
	private String name;
	private String qualification;
	private String boardName;
	private String branch;
	private int noOfYears;
	private boolean good;
	private int noOfSubjects;
	private int noOfExams;
	private String principalName;
	private boolean compulsory;
	
	public EducationDto() {
		System.out.println("running education dto");
	}
	
	
	public EducationDto(String name, String qualification, String boardName, String branch, int noOfYears, boolean good,
			int noOfSubjects, int noOfExams, String principalName, boolean compulsory) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.boardName = boardName;
		this.branch = branch;
		this.noOfYears = noOfYears;
		this.good = good;
		this.noOfSubjects = noOfSubjects;
		this.noOfExams = noOfExams;
		this.principalName = principalName;
		this.compulsory = compulsory;
	}


	@Override
	public String toString() {
		return "EducationDto [name=" + name + ", qualification=" + qualification + ", boardName=" + boardName
				+ ", branch=" + branch + ", noOfYears=" + noOfYears + ", good=" + good + ", noOfSubjects="
				+ noOfSubjects + ", noOfExams=" + noOfExams + ", principalName=" + principalName + ", compulsory="
				+ compulsory + "]";
	}


	public String getName() {
		return name;
	}


	public String getQualification() {
		return qualification;
	}


	public String getBoardName() {
		return boardName;
	}


	public String getBranch() {
		return branch;
	}


	public int getNoOfYears() {
		return noOfYears;
	}


	public boolean isGood() {
		return good;
	}


	public int getNoOfSubjects() {
		return noOfSubjects;
	}


	public int getNoOfExams() {
		return noOfExams;
	}


	public String getPrincipalName() {
		return principalName;
	}


	public boolean isCompulsory() {
		return compulsory;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}


	public void setGood(boolean good) {
		this.good = good;
	}


	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}


	public void setNoOfExams(int noOfExams) {
		this.noOfExams = noOfExams;
	}


	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}


	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}
	

}
