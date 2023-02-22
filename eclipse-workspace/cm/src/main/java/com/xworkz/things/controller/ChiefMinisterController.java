package com.xworkz.things.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.things.dto.ChiefMinisterDto;
import com.xworkz.things.service.ChiefMinisterService;

@Controller
@RequestMapping("/cm")
public class ChiefMinisterController {

	@Autowired
	private ChiefMinisterService chiefMinisterService;

	public ChiefMinisterController() {
		System.out.println("created ChiefMinisterController ");
	}

	@PostMapping
	public String onCm(ChiefMinisterDto chiefMinisterDto, Model model) {
		System.out.println("running onCm" + chiefMinisterDto);

		Set<ConstraintViolation<ChiefMinisterDto>> constraintViolations = this.chiefMinisterService
				.validateAndSave(chiefMinisterDto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("validation failed , display error message");
			constraintViolations.forEach((cv) -> System.out.println(cv.getMessage()));
		} else {
			System.out.println("validation success, display success message");
		}
		return "CM";
	}

}
