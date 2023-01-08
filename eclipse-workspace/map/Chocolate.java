package com.xworkz.examples.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Chocolate {

	public static void main(String[] args) {
		
		
		Map<String, Double>ref=new LinkedHashMap<String, Double>();
		ref.put("fiveStar", 70D);
		ref.put("kitkat ", 80D);
		ref.put("munch", 9D);
		ref.put("perk", 42D);
		ref.put("dairymilk", 35D);
		ref.put("loveit", 10D);
		ref.put("emli", 20D);
		ref.put("darkChocolate", 30D);
		ref.put("candyman", 5D);
		ref.put("eclairs", 10D);
		
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
