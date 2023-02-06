
package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/enjoy")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doGambling(CasinoDTO dto, Model model) {
		System.out.println("running doGambling.." + dto);
		model.addAttribute("name : " , dto.getName());
		model.addAttribute("entryFee : " , dto.getEntryFee());
		
		//model.addAttribute("Name : ",  dto.getName());
		//model.addAttribute("EntryFee : ", dto.getEntryFee());
		
		return "CasinoSuccess.jsp";
	}

}
