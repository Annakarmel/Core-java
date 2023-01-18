package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepositoryImpl implements SoldierRepository{
	
	public SoldierRepositoryImpl() {
		System.out.println("Created SoldierRepositoryImpl using no-arg constructor..");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save..");
		System.out.println("Dto "+dto);
		return false;
	}

}
