package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.dto.gameDto;

public class gameRunner {

	public static void main(String[] args) {
		
		gameDto dto1=new gameDto("chowkaBara", "Indoor", 6);
		gameDto dto2=new gameDto("carrom", "Indoor", 4);	
		gameDto dto3=new gameDto("lagori", "outdoor", 10);
		gameDto dto4=new gameDto("chess", "Indoor", 2);
		gameDto dto5=new gameDto("chowkaBara", "outdoor", 10);
		
		
		
		boolean equals=dto1.equals(dto5);
		System.out.println(equals);
		
		Collection<gameDto>gameName=new ArrayList<gameDto>();
		gameName.add(dto1);
		gameName.add(dto2);
		
		
		
		boolean contains=gameName.contains(dto3);
		System.out.println("contains = "+contains);
		
	}

}
