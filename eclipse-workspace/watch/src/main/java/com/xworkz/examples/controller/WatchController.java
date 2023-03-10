package com.xworkz.examples.controller;

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

import com.xworkz.examples.dto.WatchDto;
import com.xworkz.examples.service.WatchService;

@Controller
@RequestMapping("/")
public class WatchController {

	@Autowired
	private WatchService watchService;

	private List<String> brand = Arrays.asList("Titan", "fastrack", "boat");
	private List<String> color = Arrays.asList("black", "blue", "green");

	public WatchController() {
		System.out.println("created WatchController");
	}

	@GetMapping("/clock")
	public String onWatch(Model model) {
		System.out.println("running onwatch");
		List<String> brand = Arrays.asList("Titan", "fastrack", "boat");
		List<String> color = Arrays.asList("black", "blue", "green");
		model.addAttribute("brand", brand);
		model.addAttribute("color", color);
		return "Watch";
	}

	@PostMapping("/clock")
	public String onWatch(WatchDto dto, Model model) {
		System.out.println("running onwatch");
		Set<ConstraintViolation<WatchDto>> violations = this.watchService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller");
			model.addAttribute("same", "validation success");
			return "Watch";

		}

		model.addAttribute("brand", brand);
		model.addAttribute("color", color);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("violation in controller");
		return "Watch";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running onSearch search for id" + id);

		WatchDto dto = this.watchService.findById(id);
		if (dto != null) {

			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "WatchSearch";
	}

	@GetMapping("searchByType")
	public String onSearchByType(@RequestParam String type, Model model) {
		System.out.println("running onSearchByType in controller " + type);
		List<WatchDto> list = this.watchService.findByType(type);
		model.addAttribute("list", list);
		return "SearchByType";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running onUpdate " + id);
		WatchDto dto = this.watchService.findById(id);

		model.addAttribute("dto", dto);
		model.addAttribute("brand", brand);
		model.addAttribute("color", color);

		return "UpdateWatch";
	}

	@PostMapping("/update")
	public String onUpdate(WatchDto dto, Model model) {
		System.out.println("running onUpdate " + dto);

		Set<ConstraintViolation<WatchDto>> constraintViolations = this.watchService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
			model.addAttribute("errors", constraintViolations);
		} else {
			model.addAttribute("message", "....Watch Update Success....");
		}
		return "UpdateWatch";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		boolean dto = this.watchService.deleteById(id);
		model.addAttribute("message", "Enter ID to delete data");
		return "DeleteWatch";

	}
}
