package com.xworkz.examples;

public class PanCardRepositoryImp implements PanCardRepository {
	
	private String[] panCard=new String[10];
	private int panCardIndex=0;

	@Override
	public boolean id(String panCard) {
		System.out.println("running created pan card");
		
		if(this.panCardIndex>=this.panCard.length) {
			throw new PanCardSizeExceededException();
		}
		this.panCard[panCardIndex]=panCard;
		this.panCardIndex++;
		return false;
	}
		public int total() {
			return this.panCard.length;
	}

}
