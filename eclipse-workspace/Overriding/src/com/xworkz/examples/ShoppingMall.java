package com.xworkz.examples;

public class ShoppingMall {
	

		public int noOfFloors;
		public boolean elevator;

		public ShoppingMall(int noOfFloors, boolean elevator) {
			super();
			this.noOfFloors = noOfFloors;
			this.elevator = elevator;
		}

		public void display() {

			System.out.println(this.noOfFloors);
			System.out.println(this.elevator);
		}

	}



