package com.xworkz.mvcDatabase.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.mvcDatabase.dto.CMDTO;

@Service	
public class CMServiceImpl implements CMService {

	public CMServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		
		System.out.println("running validateAndSave");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);
		if(constraintViolations != null && constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exits, return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exits, data is good constraintViolations");
			return Collections.emptySet();
		}
		
	}

}
