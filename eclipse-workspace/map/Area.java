package com.xworkz.examples.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Area {

	public static void main(String[] args) {
		
		Map<String, Long>ref=new LinkedHashMap<String, Long>();
		ref.put("bh road", 577201L);
		ref.put("holebenavalli ", 577222L);
		ref.put("purale", 556330L);
		ref.put("gurupura", 587664L);
		ref.put("bhadravathi", 5674432L);
		ref.put("savalanga", 577888L);
		ref.put("shikaripura", 577113L);
		ref.put("soraba", 577112L);
		ref.put("sagara", 577232L);
		ref.put("koppa", 577333L);
		
		Set<String>keys=ref.keySet();
		
		keys.forEach(e ->System.out.println(e));
		
		System.out.println("====values====");
		Collection<Long>values=ref.values();
		values.forEach(v -> System.out.println(v));
		
		System.out.println("====keys and values=====");
		
		
		Set<Entry<String, Long>> entries=ref.entrySet();
				
		
		for (Entry <String,Long> entry: entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
