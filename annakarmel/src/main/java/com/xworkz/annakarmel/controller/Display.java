package com.xworkz.annakarmel.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.annakarmel.dto.BeverageDTO;
import com.xworkz.annakarmel.dto.ChatDTO;
import com.xworkz.annakarmel.dto.EducationDTO;
import com.xworkz.annakarmel.dto.FamilyDTO;
import com.xworkz.annakarmel.dto.MobileDTO;

@Component
@RequestMapping("/")
public class Display {

	@GetMapping("/em")
	public String onEm(Model model) {
		System.out.println("Running onEm....");
		model.addAttribute("email", "annnakrmel.xworkz@gmail.com");
		return "index.jsp";
	}
	@GetMapping("/mob")
	public String onMob(Model model) {
		System.out.println("Running onMob....");
		model.addAttribute("mobil", 9632814250L);
		return "index.jsp";
	}
	@GetMapping("/aad")
	public String onAad(Model model) {
		System.out.println("Running onAad....");
		model.addAttribute("aadhar", "8796TFN85454");
		return "index.jsp";
	}
	@GetMapping("/ag")
	public String onAg(Model model) {
		System.out.println("Running onAg....");
		model.addAttribute("age", 24);
		return "index.jsp";
	}
	@GetMapping("/birth")
	public String onBirth(Model model) {
		System.out.println("Running onBirth....");
		int datetime;
		model.addAttribute("dob",LocalDateTime.of(1999, 03, 22, 07, 45));
		return "index.jsp";
	}
	@GetMapping("/sal")
	public String onSal(Model model) {
		System.out.println("Running onSal....");
		model.addAttribute("salary", 500000);
		return "index.jsp";
	}
	@GetMapping("/frd")
	public String onFrd(Model model) {
		System.out.println("Running onFrd....");
		List<String> ref = new ArrayList<String>();
		ref.add("ashi");
		ref.add("vishi");
		ref.add("giddi");
		ref.add("pondi");
		ref.add("sunny");
		ref.add("swati");
		model.addAttribute("frds",ref);
		return "index.jsp";
	}
	@GetMapping("/visit")
	public String onVisit(Model model) {
		System.out.println("Running onVisit....");
		List<String> ref = new ArrayList<String>();
		ref.add("X-workz");
		ref.add("Sai Pg");
		ref.add("R & S Riviera");
		ref.add("Kalyangara");
		ref.add("WhiteField");
		model.addAttribute("visitt",ref);
		return "index.jsp";
	}
	@GetMapping("/set")
	public String onSet(Model model) {
		System.out.println("Running onSet....");
		List<String> ref = new ArrayList<String>();
		ref.add("Core-Java");
		ref.add("HTML");
		ref.add("CSS");
		ref.add("Bootstrap");
		ref.add("MySQL");
		model.addAttribute("skills",ref);
		return "index.jsp";
	}
	@GetMapping("/bdto")
	public String onBdto(Model model) {
		System.out.println("Running onBdto....");
		BeverageDTO dto = new BeverageDTO();
		dto.setName("cold Coffee");
		dto.setBuyer("swati");
		dto.setCold(true);
		dto.setColor("chocolate");
		dto.setFlavour("Choco");
		dto.setMadeBy("vishala");
		dto.setPrice(100);
		dto.setTaste(true);
		model.addAttribute("beverage", dto);
		return "index.jsp";
	}
	@GetMapping("/cdto")
	public String onCdto(Model model) {
		System.out.println("Running onCdto....");
		ChatDTO dto = new ChatDTO();
		dto.setCentreName("Sneha Chat centre");
		dto.setId(1);
		dto.setType("spicy");
		dto.setName("Masala chat");
		dto.setNoOfChats(10);
		dto.setOwner("Mahananda");
		dto.setOwnerPhoneNum(963852741);
		dto.setPlace("Ilkal");
		dto.setPrice(50);
		dto.setQuantity("medium");
		dto.setRatings(5);
		dto.setTasty(false);
		model.addAttribute("chat", dto);
		return "index.jsp";
	}
	@GetMapping("/edto")
	public String onEdto(Model model) {
		System.out.println("Running onEdto....");
		EducationDTO dto = new EducationDTO();
		dto.setFirstName("Sahana");
		dto.setLastName("Chittaragi");
		dto.setPhNo(963852951);
		dto.setAddress("Katageri");
		dto.setCollegeName("BGMIT Mudhol");
		dto.setCgpa(7.0);
		dto.setPlace("Mudhol");
		dto.setRank(1);
		dto.setSchoolName("Bill Memory");
		dto.setStream("CS");
		model.addAttribute("education", dto);
		return "index.jsp";
	}
	@GetMapping("/fdto")
	public String onFdto(Model model) {
		System.out.println("Running onFdto....");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Arogyanathan");
		dto.setMotherName("Shanta");
		dto.setBrotherName("Rahul");
		dto.setSisterName("Cindrella");
		dto.setAddress("Bellary");
		dto.setGrandFather("RayanGouda");
		dto.setGrandMother("Annapurna");
		dto.setHomeName("Annapurna home");
		dto.setNoOfsiblings(4);
		dto.setNativePlace("Guledgudda");
		model.addAttribute("family", dto);
		return "index.jsp";
	}
	@GetMapping("/mdto")
	public String onMdto(Model model) {
		System.out.println("Running onMdto....");
		MobileDTO dto = new MobileDTO();
		dto.setMobileName("Vivo");
		dto.setColor("Navy blue");
		dto.setVersion("S! Pro");
		dto.setRam(128);
		dto.setRom(8);
		model.addAttribute("mobile", dto);
		return "index.jsp";
	}
}
