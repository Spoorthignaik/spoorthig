package com.xworkz.examples.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pg {
	
	
	public static void main(String[] args) {
		
		
		Map<String, Double>ref=new LinkedHashMap<String, Double>();
		ref.put("Khushi pg", 7000D);
		ref.put("comfot zone ", 8000D);
		ref.put("golden eagle", 9000D);
		ref.put("sri sai", 4200D);
		ref.put("Ashraya", 3500D);
		ref.put("gajanana", 1000D);
		ref.put("swathi", 2000D);
		ref.put("princes", 3000D);
		ref.put("deepika", 4000D);
		ref.put("varun", 6500D);
		
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
