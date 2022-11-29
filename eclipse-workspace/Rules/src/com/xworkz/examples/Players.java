package com.xworkz.examples;

public class Players implements Games {

	@Override
	public boolean noOfPlayers() {
		System.out.println("running no of players");
		return false;
	}

	@Override
	public boolean dressCode() {
		System.out.println("running dress code");
		return false;
	}

	@Override
	public boolean gameTimings() {
		System.out.println("running game timings");
		return false;
	}

	@Override
	public boolean noOfTeams() {
		System.out.println("running no of teams");
		return false;
	}

	@Override
	public boolean idCard() {
		System.out.println("running id card");
		return false;
	}

}
