package com.xworkz.objects;

public class Theater {
	
	String name = "lakshmi talkies";
	boolean seatAvailable = true;
	boolean acAvailable = true;
	private String shapeOfFlexi = "rectangle";
	private String size = "medium";
	private String location = "gopi circle";
	private int noOfSeats = 800;
	public String paymentMode = "COD";
	public boolean popCorn = true;
	public int popCornPrice = 200;
	public boolean clean = true;

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public boolean isSeatAvailable() {
		return seatAvailable;
	}

	void setSeatAvailable(boolean seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public boolean isAcAvailable() {
		return acAvailable;
	}

	void setAcAvailable(boolean acAvailable) {
		this.acAvailable = acAvailable;
	}

	public String getShapeOfFlexi() {
		return shapeOfFlexi;
	}

	void setShapeOfFlexi(String shapeOfFlexi) {
		this.shapeOfFlexi = shapeOfFlexi;
	}

	public String getSize() {
		return size;
	}

	void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getPaymentMode() {
		return paymentMode;
	}
	void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public boolean isPopCorn() {
		return popCorn;
	}
	 void setPopCorn(boolean popCorn) {
		this.popCorn = popCorn;
	}
	public int getPopCornPrice() {
		return popCornPrice;
	}
	void setPopCornPrice(int popCornPrice) {
		this.popCornPrice = popCornPrice;
	}
	public boolean isClean() {
		return clean;
	}
	 void setClean(boolean clean) {
		this.clean = clean;
	}

}
