package com.xworkz.spoo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spoo.dto.BeveragesDto;
import com.xworkz.spoo.dto.ChatDto;
import com.xworkz.spoo.dto.EducationDto;
import com.xworkz.spoo.dto.FamilyDto;
import com.xworkz.spoo.dto.MobileDto;

@Component
@RequestMapping("/")
public class DisplayController {
	
	@GetMapping("/pastry")
	public String onMovie(Model model) {
		System.out.println("running movie");
		model.addAttribute("spoo","cake");
		return "index.jsp";
	}

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("runninng email");
		model.addAttribute("mail", "spoo@gmail");
		return "index.jsp";
	}
	
	@GetMapping("/mobileNo")
	public String onMobileNumber(Model model) {
		System.out.println("runninng mobile number");
		model.addAttribute("number", "76876564");
		return "index.jsp";
	}
	
	
	@GetMapping("/adharNo")
	public String onAdhaarNo(Model model) {
		System.out.println("runninng adhar no");
		model.addAttribute("adhar", "76876564");
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("runninng age");
		double age=23;
		model.addAttribute("age", age);
		return "index.jsp";
	}
	
	@GetMapping("/dob")
	public String onDateOfBirth(Model model) {
		System.out.println("runninng date of birth");
		model.addAttribute("dateOfBirth", LocalDateTime.now());
		return "index.jsp";
	}
	
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("runninng salary");
		double salary=20000;
		model.addAttribute("income", salary);
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String onFriends(Model model) {
		System.out.println("running onFriends ");
		
		List<String> ref=new ArrayList<String>();
		ref.add("vishal");
		ref.add("pavitra");
		ref.add("spoorthi");
		ref.add("varun");
		model.addAttribute("frnd",ref);
		return "index.jsp";
		
	}
	
	
	@GetMapping("/place")
	public String onPlace(Model model) {
		System.out.println("running place ");
		
		List<String> place=new ArrayList<String>();
		place.add("coorg");
		place.add("chikkamagaluru");
		place.add("goa");
		place.add("sakaleshpur");
		model.addAttribute("frnd",place);
		return "index.jsp";
		
	}
	
	
	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("running skills ");
		
		List<String> skills=new ArrayList<String>();
		skills.add("java");
		skills.add("sql");
		skills.add("html");
		skills.add("css");
		model.addAttribute("skillSet",skills);
		return "index.jsp";
		
	}
	
	@GetMapping("/beverage")
	public String onBeverages(Model model) {
		System.out.println("running onBeverages");
		
		BeveragesDto beverage=new BeveragesDto();
		 beverage.setName("black and white");
		 beverage.setPrice(290);
		 beverage.setLocation("rajajiNagar");
		 beverage.setMrpPrice(true);
		 beverage.setFlavours("grapes");
		 model.addAttribute("data1", beverage);
		 return "index.jsp";
	}
	
	@GetMapping("/chats")
	public String onChat(Model model) {
		System.out.println("running onChat");
		
		ChatDto chat=new ChatDto();
		chat.setChatName("masala puri");
		chat.setPrice(30);
		chat.setTasty(true);
		chat.setSpicy(false);
		chat.setVariety("tikki puri");
		chat.setColor("green");
		chat.setShopName("harsha bekary");
		chat.setContactNo(9741520207L);
		chat.setGood(false);
		chat.setLocation("gayatri nagar");
		chat.setArea("vv puram");
		model.addAttribute("data2", chat);
		return "index.jsp";
	}
	
	@GetMapping("/education")
	public String onEducation(Model model) {
		System.out.println("running education");
		
		EducationDto edu=new EducationDto();
		edu.setName("degree");
		edu.setQualification("BE");
		edu.setBoardName("state");
		edu.setBranch("civil");
		edu.setNoOfYears(4);
		edu.setGood(true);
		edu.setNoOfSubjects(12);
		edu.setNoOfExams(24);
		edu.setPrincipalName("biradhar");
		edu.setCompulsory(true);
		model.addAttribute("data3", edu);
		return "index.jsp";
	}
	
	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("running onFamily");
		
		FamilyDto fam=new FamilyDto();
		fam.setFamilyName("brundavana");
		fam.setNoOfMembers(13);
		fam.setNoOfChildrens(4);
		fam.setNoOfYouths(8);
		fam.setHappyFamily(true);
		fam.setFamilyHead("grand father");
		fam.setAge(56);
		fam.setGood(true);
		fam.setEducated(false);
		fam.setNameOfHouse("udaya nilaya");
		model.addAttribute("data4", fam);
		return "index.jsp";
	}
	
	@GetMapping("/mob")
	public String onMobile(Model model) {
		System.out.println("running onMobile ");
		
		MobileDto phone=new MobileDto();
		phone.setMobileName("realme9i");
		phone.setBrand("realme");
		phone.setVersion(12);
		phone.setPrice(20000D);
		phone.setColor("black");
		phone.setLength(14.5);
		phone.setWidth(8.6);
		phone.setWarranty(true);
		phone.setEmi(false);
		phone.setWarrantyYears(1);
		model.addAttribute("data5", phone);
		return "index.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
