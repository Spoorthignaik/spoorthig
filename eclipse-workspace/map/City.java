package com.xworkz.examples.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class City {

	public static void main(String[] args) {
		
		
		Map<String, Double>ref=new LinkedHashMap<String, Double>();
		ref.put("shivamogga", 30.2);
		ref.put("bangalore ", 28.9);
		ref.put("tumkur", 26.4);
		ref.put("Tarikere", 31.1);
		ref.put("davanagere", 28.8);
		ref.put("chitradurga", 24.3);
		ref.put("kadur", 21.9);
		ref.put("birur", 22.2);
		ref.put("hospet", 23.6);
		ref.put("bhadravathi", 27.7);
		
		Set<String>keys=ref.keySet();
		
		keys.forEach(e ->System.out.println(e));
		
		System.out.println("====values====");
		Collection<Double>values=ref.values();
		values.forEach(v -> System.out.println(v));
		
		System.out.println("====keys and values=====");
		
		
		Set<Entry<String, Double>> entries=ref.entrySet();
				
		
		for (Entry <String,Double> entry: entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
