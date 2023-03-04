package com.xworkz.apartment.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.apartment.dto.ApartmentDTO;
import com.xworkz.apartment.service.ApartmentService;

@Controller
@RequestMapping("/")
public class ApartmentController {

	@Autowired
	private ApartmentService apartmentService;
	
	public ApartmentController() { 
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	List<Integer> noOfRooms = Arrays.asList(1, 2, 4, 5, 7, 10);
	
	List<String> places  = Arrays.asList("Banglore", "Hubli", "Bagalkot", "Manglore", "Mudhol","Guledgudd");
	
	@GetMapping("/apartt")
	public String onCool(Model model) {
		System.out.println("running onCool");
		
		model.addAttribute("noOfRooms", noOfRooms);
		model.addAttribute("places", places);
		return "Apartment";
		
	}
	
	@GetMapping("/find")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running onSearch for id" + id);
		
		ApartmentDTO dto = this.apartmentService.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		return "ApartmentSearch";
		}
	
	@PostMapping("/apartt")
	public String onCool(ApartmentDTO dto, Model model) {
		System.out.println("running onCool.." + dto);
		
		Set<ConstraintViolation<ApartmentDTO>> violation = this.apartmentService.validateAndSave(dto);
		if(violation.isEmpty()) {
			System.out.println("There are no violations");
			return "ApartmentSuccess";
		}
		
		model.addAttribute("noOfRooms", noOfRooms);
		model.addAttribute("places", places);
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		System.out.println("violation in controller");
		return "Apartment";	
	}
	
	@GetMapping("/searchplaces")
	public String onSearchPlaces(@RequestParam String places, Model model) {
		System.out.println("running onSearchPlaces controller "+places);
		List<ApartmentDTO> list = this.apartmentService.findByplaces(places);
		model.addAttribute("list", list);
		
		return "SearchPlaces";
	}
	
	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running onUpdate "+id);
		ApartmentDTO dto = this.apartmentService.findById(id);
		model.addAttribute("dto",dto);
		model.addAttribute("noOfRooms", noOfRooms);
		model.addAttribute("places", places);
		
		return "UpdateApartment";
	}
	@PostMapping("update")
	public String onUpdate(ApartmentDTO dto, Model model) {
		System.out.println("running onUpdate "+dto);
		Set<ConstraintViolation<ApartmentDTO>> constraintViolations = this.apartmentService.validateAndUpdate(dto);
		if(constraintViolations.size() > 0) {
			model.addAttribute("errors", constraintViolations);
		}else {
			model.addAttribute("message","Trimmer Update Success..");
		}
		return "UpdateApartment";
	}
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.apartmentService.validateAndDelete(id);
		if(delete=true) {
			System.out.println("deleted data of :"+id);
			model.addAttribute("delete", "Deleted successfully : ID :");
			model.addAttribute("id",id);
		}else{
			model.addAttribute("notDeleted","Id not found");
		}
		return "SearchPlaces";
	}
}
