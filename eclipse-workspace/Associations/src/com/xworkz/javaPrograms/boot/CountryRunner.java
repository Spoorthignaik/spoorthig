package com.xworkz.javaPrograms.boot;

import com.xworkz.javaPrograms.City;
import com.xworkz.javaPrograms.Country;
import com.xworkz.javaPrograms.Gender;
import com.xworkz.javaPrograms.Mountain;
import com.xworkz.javaPrograms.Name;
import com.xworkz.javaPrograms.President;

public class CountryRunner {



		public static void main(String[] args) {
			
			Country country = new Country("India");
			President president = new President("AbdulKalam");
			
			president.setGender(Gender.MALE);
			
	        country.setPresident(president);
			
			Name name1 = new Name("Ramnath kovind","Pratibha Patil","Pranav Mukharji");
			City city1 = new City(name1,true,1234.5);
			
		
			Name name2 = new Name("Drupati Murmu", "APG Abdul Kalam", null);

			City city2 = new City(name2, false, 5632.35);

			City[] cit = { city1, city2 };
			
			country.setCities(cit);

			country.display();
			
			
			Mountain mountain=new Mountain("Nandi Hills", 35000);
			
			Mountain[] mountains= {mountain};
			
			country.setMountains(mountains);
			
			

		}

	}
