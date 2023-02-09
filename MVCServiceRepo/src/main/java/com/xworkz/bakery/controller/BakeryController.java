package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBakery(BakeryDTO bakeryDTO, Model model) {
		System.out.println("running onBakery "+ bakeryDTO);
		model.addAttribute("name", bakeryDTO.getName());
		model.addAttribute("ownername", bakeryDTO.getOwnerName());
		model.addAttribute("wifename", bakeryDTO.getOwnerWifeName());
		model.addAttribute("famousFor", bakeryDTO.getFamousFor());
		model.addAttribute("marriedOrNot", bakeryDTO.isMarried());
		model.addAttribute("since", bakeryDTO.getSince());
		boolean saved = this.bakeryService.validateAndSave(bakeryDTO);
		System.out.println("saved "+saved);
		return "Bakery.jsp";
		
	}
}
