package com.xworkz.things.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class ChiefMinisterDto {

	@NotNull(message = "CM name cannot be null or blank")
	@Size(min = 3,max = 20,message = "CM name should be more than 3 and less than 20 chars")
	private String name;
	@NotBlank(message = "party cannot be null")
	private String party;
	@NotBlank(message = "state cannot be null")
	private String state;
	@NotNull(message = "tenure cannot be null")
	@Min(value = 1,message="tenure cannot be less than zero")
	private int tenure;
	@NotBlank(message = "portfolio cannot be null")
	private String portfolio;
	
	
	public ChiefMinisterDto() {
		System.out.println("created ChiefMinisterDto");
	}


	public ChiefMinisterDto(
			@NotNull(message = "CM name cannot be null or blank") @Size(min = 3, max = 20, message = "CM name should be more than 3 and less than 20 chars") String name,
			@NotBlank(message = "party cannot be null") String party,
			@NotBlank(message = "state cannot be null") String state,
			@NotNull(message = "tenure cannot be null") @Min(value = 1, message = "tenure cannot be less than zero") int tenure,
			@NotBlank(message = "portfolio cannot be null") String portfolio) {
		super();
		this.name = name;
		this.party = party;
		this.state = state;
		this.tenure = tenure;
		this.portfolio = portfolio;
	}


	@Override
	public String toString() {
		return "ChiefMinisterDto [name=" + name + ", party=" + party + ", state=" + state + ", tenure=" + tenure
				+ ", portfolio=" + portfolio + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}


	public String getParty() {
		return party;
	}


	public String getState() {
		return state;
	}


	public int getTenure() {
		return tenure;
	}


	public String getPortfolio() {
		return portfolio;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setParty(String party) {
		this.party = party;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	
	
	
	
}
