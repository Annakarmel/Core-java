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
@NoArgsConstructor
@AllArgsConstructor
public class SoldierDTO extends AbstractAuditDTO {
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Name must be greater than 3 and less than 20")
	private String name;
	
	@Max(100000)
	@Min(value = 0, message = "Id must be greater than zero")
	private int id;
	
	
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Rank must be greater than 3 and less than 20")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Batallion must be greater than 3 and less than 20")
	private String batallion;
	
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "Country must be greater than 3 and less than 20")
	private String country;

	
}
