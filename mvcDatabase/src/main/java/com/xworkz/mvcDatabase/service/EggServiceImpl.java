package com.xworkz.mvcDatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.mvcDatabase.dto.EggDTO;
import com.xworkz.mvcDatabase.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService{

	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("running validate and save in EggService");
		boolean saved = this.eggRepository.save(dto);
		System.out.println("saved in service"+saved);
		return false;
		
	}
}
