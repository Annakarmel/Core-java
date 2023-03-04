package com.xworkz.apartment.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.apartment.dto.ApartmentDTO;

public interface ApartmentService {

	Set<ConstraintViolation<ApartmentDTO>> validateAndSave(ApartmentDTO dto);

	default ApartmentDTO findById(int id) {
		return null;
	}
	
	default List<ApartmentDTO> findByplaces(String places) {
		return null;
	}
	
	Set<ConstraintViolation<ApartmentDTO>> validateAndUpdate(ApartmentDTO dto);

	boolean validateAndDelete(int id);

}
