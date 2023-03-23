package com.xworkz.examples.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.examples.dto.WatchDto;
import com.xworkz.examples.service.WatchService;
import com.xworkz.examples.service.WatchServiceImpl;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/")
public class WatchController {

	
	private static final Logger LOGGER = Logger.getLogger(ImageController.class);
	
	@Autowired
	private WatchService watchService;

	private List<String> brand = Arrays.asList("Titan", "fastrack", "boat");
	private List<String> color = Arrays.asList("black", "blue", "green");

	public WatchController() {
		LOGGER.info("WatchController");
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
			LOGGER.info("no violations in controller");
			model.addAttribute("same", "validation success");
			return "Watch";

		}

		model.addAttribute("brand", brand);
		model.addAttribute("color", color);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		LOGGER.info("violation in controller");
		return "Watch";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		LOGGER.info("running onSearch search for id" + id);

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
		LOGGER.info("running onSearchByType in controller " + type);
		List<WatchDto> list = this.watchService.findByType(type);
		model.addAttribute("list", list);
		return "SearchByType";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		LOGGER.info("running onUpdate " + id);
		WatchDto dto = this.watchService.findById(id);

		model.addAttribute("dto", dto);
		model.addAttribute("brand", brand);
		model.addAttribute("color", color);

		return "UpdateWatch";
	}

	@PostMapping("/update")
	public String onUpdate(WatchDto dto, Model model) {
		LOGGER.info("running onUpdate " + dto);

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
		LOGGER.info("Running find By id in Controller:" + id);
		WatchDto dto = this.watchService.deleteById(id);
		if (dto == null) {

			model.addAttribute("id", id);
			// model.addAttribute("error", "Name not found");
			model.addAttribute("message", "Delete Succesfully");
		} else {
			model.addAttribute("error", "Name not found");
		}
		return "DeleteWatch";
	}

	
	
	@GetMapping("findAll")
	public String onFindAll(Model model) {
		LOGGER.info("Running OnFindAll in Controller");
		List<WatchDto> dto = this.watchService.findAll();
		if (dto != null) {
			model.addAttribute("dto", dto);

		} else {
			model.addAttribute("message", "Data not Found");
		}
		return "findAll";
	}
	
	
	@GetMapping("/findByBrand")
	public String onfindByBrand(@RequestParam String brand, Model model) {
		LOGGER.info("Running find By Brand in Controller:" + brand);
		List<WatchDto> dto = this.watchService.findByBrand(brand);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("messege ", "Brand not found");
		}
		return "findByBrand";
	}
	
	
	
	@PostMapping("findByBrandAndType")
	public String onfindByBrandAndType(@RequestParam String brand, String type, Model model) {
		System.out.println("Running findByBrandAndType in controller:" + brand + type);
		if (!brand.isEmpty() && type.isEmpty()) {
			List<WatchDto> dtoBrand = this.watchService.findByBrand(brand);
			if (dtoBrand.size() != 0) {
				model.addAttribute("dtobrand", dtoBrand);
				return "findByBrandAndType";
			} else {
				model.addAttribute("message", "brand not found");
				return "findByBrandAndType";
			}
		} else if (brand.isEmpty() && !type.isEmpty()) {
			List<WatchDto> dtoType = this.watchService.findByType(type);
			if (dtoType.size() != 0) {
				model.addAttribute("dtotype", dtoType);
				return "findByBrandAndType";
			} else {
				model.addAttribute("message", "type not found");
				return "findByBrandAndType";
			}

		}else {

		List<WatchDto> dto = this.watchService.findByBrandAndType(brand, type);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("messege", "data not Found");
		}
		return "findByBrandAndType";
		}
	}
	
	
	

}
