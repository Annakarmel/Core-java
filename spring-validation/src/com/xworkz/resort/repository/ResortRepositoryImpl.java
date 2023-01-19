
package com.xworkz.resort.repository;

import org.springframework.stereotype.Component;

import com.xworkz.resort.dto.ResortDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortRepositoryImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save in repo..");
		System.out.println("resortDTO "+dto);
		return true;
	}

}
