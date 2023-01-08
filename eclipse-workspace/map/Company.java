package com.xworkz.examples.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {
	
	public static void main(String[] args) {
		Map<String, String>ref=new LinkedHashMap<String, String>();
		ref.put("Acuvate", " Hyderabad");
		ref.put("Eton ", "WhiteField");
		ref.put("Dextritus", "btmLayout");
		ref.put("google", "maratahalli");
		ref.put("microsoft", "whiteField");
		ref.put("Steller", "RajajiNagar");
		ref.put("smartCity", "shivamogga");
		ref.put("salesMarket", "machenahalli");
		ref.put("devService", "rajastan");
		ref.put("thinkCore", "majestic");
		
		Set<String>keys=ref.keySet();
		
		keys.forEach(e ->System.out.println(e));
		
		System.out.println("====values====");
		Collection<String>values=ref.values();
		values.forEach(v -> System.out.println(v));
		
		System.out.println("====keys and values=====");
		
		
		Set<Entry<String, String>> entries=ref.entrySet();
				
		
		for (Entry <String,String> entry: entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
		
	}

}
