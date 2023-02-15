package com.xworkz.mvcDatabase.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.mvcDatabase.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}
