package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.examples.constants.type;
import com.xworkz.examples.dto.DataBaseVendorDto;

public class DataBaseVendorDtoRunner {

	public static void main(String[] args) {
		
		
		Collection<DataBaseVendorDto>data=new ArrayList<DataBaseVendorDto>();
		data.add(new DataBaseVendorDto("oracle","larryElision" , type.OR, 1.4D, 475000D));
		data.add(new DataBaseVendorDto("my sql", "Raymond boyce", type.R, 256, 655687676D));
		data.add(new DataBaseVendorDto("IBM Db2", "ibm", type.RELATIONAL, 666, 6765333343D));
		data.add(new DataBaseVendorDto("File maker", "nashoba", type.OR, 977, 778763D));
		
		
		
		data.stream()
		
		.map(dto ->dto.getDevelopedBy().toUpperCase() )	
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(dto));
		
		data.stream().map(dto ->dto.getLicenseCost()<100&& dto.getType()==type.R )
		.collect(Collectors.toSet())
		.forEach(dto -> System.out.println(dto));
		data.stream().map(dto -> dto.getType()).collect(Collectors.toList())
		.forEach(dto-> System.out.println(dto));

	}

}
