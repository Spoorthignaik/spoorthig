package com.xworkz.things.boot;

import com.xworkz.things.Invitation;
import com.xworkz.things.WeddingInvitation;

public class InvitationRunner {

	public static void main(String[] args) {
		
		Invitation invitation1=new WeddingInvitation("openType", 50, "greeting");
		System.out.println(invitation1.patterns);
		System.out.println(invitation1.price);
		System.out.println(invitation1.usedfor);
		
		

	}

}
