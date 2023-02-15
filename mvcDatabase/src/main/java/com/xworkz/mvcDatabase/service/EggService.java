package com.xworkz.mvcDatabase.service;

import com.xworkz.mvcDatabase.dto.EggDTO;

public interface EggService {

	boolean validateAndSave(EggDTO dto);
}
