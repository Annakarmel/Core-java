package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepository;

public  class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepository soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no-arg Constructor..");
	}
	
	public void setSoldierRepo(SoldierRepository soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Executing validate And Save is now..");
		System.out.println("DTO initialized:"+dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("There are validation error..");
			
			violations.forEach(v -> {
				System.err.println("Violating error "+ v.getMessage());
			});
			
			return false;
		} else {
			System.out.println("Data is valid...");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo"+saved);
			return saved;
		}
	}
	
	
}
