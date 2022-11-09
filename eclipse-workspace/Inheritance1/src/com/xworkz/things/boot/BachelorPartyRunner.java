package com.xworkz.things.boot;

import com.xworkz.things.BachelorParty;
import com.xworkz.things.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		
		
		BachelorParty party=new Party(10,"rajajinagar",true);
		System.out.println(party.venue);
		System.out.println(party.enjoyed);
		System.out.println(party.time);
	}

}
