package com.xworkz.examples.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TerroristDTO extends AbstractAuditDto {
	
	@NonNull
	@NotNull
	@Size(min=3,max=20,message = "name isinvalid ,should be more than 3" )
	private String name;
	@NonNull
	@Min(value = 1,message = "Age should be greater than 1 or less than 150")
	@Max(value = 150,message = "Age should be greater than 1 or less than 150")
	private int age;
	@NonNull
	private String country;
	private boolean alive;
	private boolean prison;
    private String specialization;
    private String organization;
    
    
	
}
