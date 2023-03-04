package com.xworkz.apartment.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApartmentDTO {

	@NotNull(message = "id should not be null")
	private int id;
	@Size(min = 3, max = 20, message = "apartmentName should not be less than 3 or greater than 20")
	private String apartmentName;
	@Size(min = 3, max = 20, message = "ownerName should not be less than 3 or greater than 20")
	private String ownerName;
	@NotNull(message = "noOfRooms should not be null")
	private int noOfRooms;
	@Size(min = 3, max = 20, message = "address should not be less than 3 or greater than 20")
	private String address;
	@Size(min = 3, max = 20, message = "place should not be less than 3 or greater than 20")
	private String places;
	
	public ApartmentDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
