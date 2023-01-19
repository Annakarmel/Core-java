package com.xworkz.firstAid.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAid.dto.FirstAidDTO;
import com.xworkz.firstAid.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("Created Service by passing repo...");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("Excecuting validation and save start..");
		System.out.println("Dto saved:" +dto);
	
		
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid.. can save");
			boolean saved = this.firstAidRepo.save(dto);
			System.out.println("Saved firstAid " + saved);
			return saved;
		}
	}

}
