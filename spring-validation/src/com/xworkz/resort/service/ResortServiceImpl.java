package com.xworkz.resort.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.repository.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
		System.out.println("Created service repo by passing repo..");
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Executing validation and save start..");
		System.out.println("Dto saved: "+dto);
		
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid.. can save");
			boolean saved = this.resortRepo.save(dto);
			System.out.println("Saved resort " + saved);
			return saved;
		}
	}

}
