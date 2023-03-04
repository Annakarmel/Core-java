package com.xworkz.apartment.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.apartment.entity.ApartmentEntity;

public interface ApartmentRepository {

boolean save(ApartmentEntity entity);

boolean update(ApartmentEntity entity);

	
	default ApartmentEntity findBy(int id) {
		return null;
	}
	
	default List<ApartmentEntity> findByplaces(String places){
		return Collections.emptyList();
	}

	boolean delete(int id);
}
