package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.dto.InterviewDto;

@Component
@RequestMapping("/attend")
public class InterviewComponent {
 
	public InterviewComponent() {
		System.out.println("created InterviewComponent");
	}
	
	@PostMapping
	public String onAttend(InterviewDto dto) {
		System.out.println("running on attend");
		System.out.println("dto is :"+dto);
		return "Interview.jsp";
	}
}
