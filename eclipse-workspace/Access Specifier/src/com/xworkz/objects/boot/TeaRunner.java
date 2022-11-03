package com.xworkz.objects.boot;

import com.xworkz.objects.Tea;
import com.xworkz.objects.TeaAccess;

public class TeaRunner {

	public static void main(String[] args)
	{

		TeaAccess teaAccess = new TeaAccess();
		Tea tea = new Tea();

		System.out.println(tea.getType());
		System.out.println(tea.getBrand());
		System.out.println(tea.getPrice());
		System.out.println(tea.getColor());
		System.out.println(tea.getIngredients());
		System.out.println(tea.isGood());
		System.out.println(tea.getBarcode());
		System.out.println(tea.isStrong());
		System.out.println(tea.isOnlineOrder());
		System.out.println(tea.getType());
		System.out.println(tea.getFlavour());

		System.out.println(System.lineSeparator());
		teaAccess.tea1(tea);
			
		
		
		
		
		
		
	}
	
}
