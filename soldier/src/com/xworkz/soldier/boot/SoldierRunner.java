package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepository;
import com.xworkz.soldier.repository.SoldierRepositoryImpl;

import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto = new SoldierDTO("Muskan", 1, "Turkey", "lower", "Istanbul");
		

		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepository repo = new SoldierRepositoryImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}

}
