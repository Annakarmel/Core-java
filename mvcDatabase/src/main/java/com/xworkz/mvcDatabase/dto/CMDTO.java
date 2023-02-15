package com.xworkz.mvcDatabase.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CMDTO {

	@NotNull(message = "Cm name cannot be null or blank")
	@Size(min = 3, max = 20, message = "CM Name should be more than 3 and less than 20 charecters")
	private String name;
	@NotBlank(message = "Party cannot be null")
	private String party;
	@NotBlank(message = "State cannot be null")
	private String state;
	@NotNull(message = "Tenure cannot be null")
	@Min(value = 1, message = "Tenure cannot be less than zero")
	private Integer tenure;
	@NotBlank(message = "Portfolio cannot be null")
	private String portfolio;

}
