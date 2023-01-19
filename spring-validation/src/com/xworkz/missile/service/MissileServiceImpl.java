package com.xworkz.missile.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.missile.dto.MissileDTO;
import com.xworkz.missile.repository.MissileRepository;

@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private Validator validator;
	private MissileRepository missileRepository;
	
	@Autowired
	public MissileServiceImpl(MissileRepository missileRepository) {
		this.missileRepository = missileRepository;
		System.out.println("Created service repo by passing repo..");
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Executing validation and save start..");
		System.out.println("Dto saved: "+dto);
		
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid.. can save");
			boolean saved = this.missileRepository.save(dto);
			System.out.println("Saved missile " + saved);
			return saved;
		}
	}

}
