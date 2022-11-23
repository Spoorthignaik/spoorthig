package com.xworks.examples.boot;

import com.xworks.examples.God;

public class GodRunner {

	public static void main(String[] args) {
		
		
		God god=new God();
		god.setName("shiva");
		god.setGender("male");
		god.setWeapons("trishool");
		god.setPower("mukkanna");
		god.setAnotherName("shiva");
		god.setNoOfAvatharas(23);
		god.setAvatarName("lingam");
		god.setTemple(true);
		god.setNoOfTemples(2);
		god.setLocation("shivamogga");

		God god1=new God("shiva","male","trishool","mukkann","shiva",13,"lingam",true,2,"shivamogga");
		
		boolean same=god.equals(god1);
		System.out.println(same);
		
	}

}
