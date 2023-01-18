package com.xworkz.terrorist.boot;

import java.time.LocalDateTime;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TerroristDTO dto = new TerroristDTO();
		dto.setName("Osama Bin Laden");
		dto.setAge(55);
		dto.setCountry("Afghanistan");
		dto.setAlive(false);
	   dto.setOrganization("Alqida");
	   dto.setPrison(false);
	   dto.setSpecialization("Killing the innocent people");
	   dto.setCreatedAt(LocalDateTime.now());
	   dto.setUpdatedAt(LocalDateTime.now());
	   dto.setCreatedBy("sahana");
	   dto.setUpdatedBy("sahana");
	   System.out.println(dto);
		
		TerroristService service = new TerroristServiceImpl() {
		};
		service.validatingAndSaving(dto);
	}

}
