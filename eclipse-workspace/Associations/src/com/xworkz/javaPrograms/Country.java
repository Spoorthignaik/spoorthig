package com.xworkz.javaPrograms;


public class Country {
	
	public String name;
	public City[] cities;
	public President president;
    public Mountain[] mountains;
	
	
	public Country(String name) {
		this.name = name;

	}
	
	public void setMountains(Mountain[] mountains) {
		this.mountains = mountains;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void showOff() {
		if (cities != null) {

			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];

				if (city != null) {
					System.out.println("created name of the country");
					city.show();
				}
			}
		} else {
			System.out.println("Welcome to the Null world");
		}

		if (president != null) {

			System.out.println("name of the country and capital");

			this.president.show();

		} else {
			System.out.println("Welcome to the world");
		}

		System.out.println(this.name);

	}

}
