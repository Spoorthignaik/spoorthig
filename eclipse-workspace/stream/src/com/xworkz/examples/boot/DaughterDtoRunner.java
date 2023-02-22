package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;import java.util.function.Predicate;

import com.xworkz.examples.dto.DaughterDto;

public class DaughterDtoRunner {

	public static void main(String[] args) {
		
		Collection<DaughterDto>daughter=new ArrayList<DaughterDto>();
		daughter.add(new DaughterDto("pavitra", 9741520207L, 23, true, true));
		daughter.add(new DaughterDto("sneha", 897620207L, 22, false, true));
		daughter.add(new DaughterDto("shambhavi", 7891520207L, 21, true, true));
		daughter.add(new DaughterDto("sinchana", 63621520207L, 20, true, false));
		
		daughter.stream().filter(t -> )
		
	}

}
