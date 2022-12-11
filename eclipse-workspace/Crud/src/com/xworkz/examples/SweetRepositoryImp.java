package com.xworkz.examples;

public class SweetRepositoryImp  implements SweetRepository{
	
	private String[] sweets=new String[9];
	private int sweetIndex=0;

	@Override
	public boolean name(String name) {
		System.out.println("running create sweet name");
		
		if(this.sweetIndex>=this.sweets.length) {
			throw new SweetSizeExceededException();
		}
		this.sweets[sweetIndex]=name;
		this.sweetIndex++;
		return false;
	}
	
	public int total() {
		return this.sweets.length;
	}

}
