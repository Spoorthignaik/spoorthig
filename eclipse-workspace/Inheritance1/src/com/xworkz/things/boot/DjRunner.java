package com.xworkz.things.boot;

import com.xworkz.things.DJ;
import com.xworkz.things.WeddingDJ;

public class DjRunner {

	public static void main(String[] args) {
		
		DJ dj=new WeddingDJ("tumur",true,1500);
		System.out.println(dj.location);
		System.out.println(dj.noOfMembers);
		System.out.println(dj.partySong);
		
	}

}
