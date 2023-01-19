package com.xworkz.missile.repository;

import org.springframework.stereotype.Component;

import com.xworkz.missile.dto.MissileDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class MissileRepositoryImpl implements MissileRepository {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Running save in repository..");
		System.out.println("missileDTO "+dto );
		return true;
	}

}
