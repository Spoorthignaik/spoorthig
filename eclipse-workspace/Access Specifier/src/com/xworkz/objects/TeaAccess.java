package com.xworkz.objects;

public class TeaAccess {

	public Tea tea;

	public void tea1(Tea tea) {

		System.out.println(tea.getType());
		tea.setType("lemon tea");
		System.out.println("modified name" + tea.getType());

		System.out.println(tea.getBrand());
		tea.setBrand("majusha");
		System.out.println("modified name" + tea.getBrand());

		System.out.println( tea.isGood());
		 tea.setGood(true);
		System.out.println("modified name"+ tea.isGood());
		
		System.out.println( tea.getColor());
		 tea.setColor("brown");
		System.out.println("modified name"+ tea.getColor());
		
		System.out.println(tea.isStrong());
		tea.setStrong(true);
		System.out.println("modified name" + tea.isStrong());

		System.out.println(tea.getPrice());
		tea.setPrice(50);
		System.out.println("modified name" + tea.getPrice());

		System.out.println(tea.getFlavour());
		tea.setFlavour("mint");
		System.out.println("modified name" + tea.getFlavour());

		System.out.println(tea.getIngredients());
		tea.setIngredients("tea leaves");
		System.out.println("modified name" + tea.getIngredients());

		System.out.println(tea.isOnlineOrder());
		tea.setOnlineOrder(false);
		System.out.println("modified name" + tea.isOnlineOrder());

	}

}
