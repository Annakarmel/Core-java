package com.xworkz.mvcDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mvcDatabase.dto.EggDTO;
import com.xworkz.mvcDatabase.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {

	@Autowired
	private EggService eggService;

	public EggController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onOrder(EggDTO dto, Model model) {
		System.out.println("running onOrder " + dto);
		boolean saved = this.eggService.validateAndSave(dto);
		System.out.println("saved :" + saved);
		return "index";

	}
}
