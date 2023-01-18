package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SoldierDto extends AbstractAuditDto{
	
	@NotNull
	@NotBlank
	@Size(min = 3,max=20,message = "name mustbe >3 and <20")
	private String name;
	@Min(value = 0,message = "Id must be greater than zero")
	@Max(10000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min = 3,max=20)
	private String rank;
	private String battalion;
	private String country;

}
