package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class CasinoDTO {
	
	private String name;
	private String cuise;
	private Double entryFee;
	private boolean food;
	
	public CasinoDTO() {
		System.out.println("Created CasinoDTO using no-args constructor....");
	}
	


}