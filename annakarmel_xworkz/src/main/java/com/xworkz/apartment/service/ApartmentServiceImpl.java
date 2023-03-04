package com.xworkz.apartment.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.apartment.dto.ApartmentDTO;
import com.xworkz.apartment.entity.ApartmentEntity;
import com.xworkz.apartment.repository.ApartmentRepository;

@Service
public class ApartmentServiceImpl implements ApartmentService {

	@Autowired
	private ApartmentRepository apartmentRepository;

	public ApartmentServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ApartmentDTO>> validateAndSave(ApartmentDTO dto) {
		System.out.println("running validateAndSave");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ApartmentDTO>> violation = validator.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.out.println("violations are there");
			return violation;
		} else {
			System.out.println("There are no violation in dto ");
			ApartmentEntity entity = new ApartmentEntity();
			entity.setApartmentName(dto.getApartmentName());
			entity.setOwnerName(dto.getOwnerName());
			entity.setNoOfRooms(dto.getNoOfRooms());
			entity.setAddress(dto.getAddress());
			entity.setPlaces(dto.getPlaces());

			boolean saved = this.apartmentRepository.save(entity);
			System.out.println("data saved " + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public ApartmentDTO findById(int id) {

		if (id > 0) {
			ApartmentEntity entity = this.apartmentRepository.findBy(id);
			if (entity != null) {
				System.out.println("entity is found in service for id " + id);
				ApartmentDTO dto = new ApartmentDTO();
				dto.setApartmentName(entity.getApartmentName());
				dto.setOwnerName(entity.getOwnerName());
				dto.setNoOfRooms(entity.getNoOfRooms());
				dto.setAddress(entity.getAddress());
				dto.setPlaces(entity.getPlaces());
				dto.setId(entity.getId());
				return dto;
			}

		}
		return ApartmentService.super.findById(id);

	}

	@Override
	public List<ApartmentDTO> findByplaces(String places) {
		System.out.println("running findByplaces in service " + places);

		if (places != null && !places.isEmpty()) {
			System.out.println("Places is valid.... calling repo...");
			List<ApartmentEntity> entities = this.apartmentRepository.findByplaces(places);

			List<ApartmentDTO> listOfdto = new ArrayList<ApartmentDTO>();
			for (ApartmentEntity entity : entities) {
				ApartmentDTO dto = new ApartmentDTO();
				dto.setId(entity.getId());
				dto.setApartmentName(entity.getApartmentName());
				dto.setAddress(entity.getAddress());
				dto.setNoOfRooms(entity.getNoOfRooms());
				dto.setOwnerName(entity.getOwnerName());
				dto.setPlaces(entity.getPlaces());
				listOfdto.add(dto);
			}
			System.out.println("size of dtos " + listOfdto.size());
			System.out.println("size of entities " + entities.size());
			return listOfdto;

		} else {
			System.out.println("Places is invalid");
		}

		return ApartmentService.super.findByplaces(places);
	}

	@Override
	public Set<ConstraintViolation<ApartmentDTO>> validateAndUpdate(ApartmentDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ApartmentDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in DTO " + dto);
			return violations;
		} else {
			System.out.println("Violations are not there in dto and can save data");
			ApartmentEntity entity = new ApartmentEntity();
			entity.setId(dto.getId());
			entity.setApartmentName(dto.getApartmentName());
			entity.setAddress(dto.getAddress());
			entity.setNoOfRooms(dto.getNoOfRooms());
			entity.setOwnerName(dto.getOwnerName());
			entity.setPlaces(dto.getPlaces());
			boolean saved = this.apartmentRepository.update(entity);
			System.out.println("Entity data is saved" + saved);
			return Collections.emptySet();
		}
	}
	
	
	@Override
	public boolean validateAndDelete(int id) {
		System.out.println("Running validateAndDelete");
		if(id < 0) {
			return false;
		}else {
			boolean deleted = this.apartmentRepository.delete(id);
			System.out.println("Deleted: "+deleted);
			return deleted;
//			ApartmentDTO dto = this.findById(id);
//			ApartmentEntity entity = new ApartmentEntity();
//			entity.setId(dto.getId());
//			entity.setAddress(dto.getAddress());
//			entity.setApartmentName(dto.getApartmentName());
//			entity.setNoOfRooms(dto.getNoOfRooms());
//			entity.setOwnerName(dto.getOwnerName());
//			entity.setPlaces(dto.getPlaces());
//			boolean deleted1 = this.apartmentRepository.delete(entity);
//			return deleted1;
		}
	}
}
