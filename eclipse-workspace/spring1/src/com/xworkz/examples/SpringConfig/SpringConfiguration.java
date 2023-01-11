package com.xworkz.examples.SpringConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xorkz")
public class SpringConfiguration {

	

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beanProject")
public class InstitutionConfiguration {

	@Bean("instituteName")
	public String name() {
		System.out.println("Registered name with spring");
		String string = new String();
		return string;
	}

	@Bean("insitutePlace")
	public String place() {
		System.out.println("Registered place with spring");
		String string = new String();
		return string;
	}

	@Bean("instituteAddress")
	public String address() {
		System.out.println("Registered address with spring");
		String string = new String();
		return string;
	}

	@Bean("instituteCityName")
	public String cityName() {
		System.out.println("Registered cityName with spring");
		String string = new String();
		return string;
	}

	@Bean("instituteOwnerAddress")
	public String ownerAddress() {
		System.out.println("Registered ownerAddress with spring");
		String string = new String();
		return string;
	}

	@Bean("busName")
	public StringBuilder busName() {
		System.out.println("Registerd busName with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("busOwner")
	public StringBuilder busOwnerName() {
		System.out.println("Registerd busOwnerName with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("busEmail")
	public StringBuilder email() {
		System.out.println("Registerd email with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("busOwnerWifeName")
	public StringBuilder wifetName() {
		System.out.println("Registerd wifeName with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("busOwnerDaughterName")
	public StringBuilder daughterName() {
		System.out.println("Registerd daughterName with spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("areaName")
	public StringBuffer Name() {
		System.out.println("Registered Name with spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("areaTalukName")
	public StringBuffer talukName() {
		System.out.println("Registered talukName with spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("areaOldName")
	public StringBuffer oldName() {
		System.out.println("Registered oldName with spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("areaNewName")
	public StringBuffer newName() {
		System.out.println("Registered newName with spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("areaFamousFor")
	public StringBuffer famousFor() {
		System.out.println("Registered famousFor with spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("girlIsRich")
	public boolean rich() {
		System.out.println("Registered rich with spring");
		return false;
	}

	@Bean("girlIsAlive")
	public boolean alive() {
		System.out.println("Registered alive with spring");
		return true;
	}

	@Bean("girlIsFatherAlive")
	public boolean fatherAlive() {
		System.out.println("Registered fatherAlive with spring");
		return false;
	}

	@Bean("girlIsMotherAlive")
	public boolean motherAlive() {
		System.out.println("Registered motherAlive with spring");
		return true;
	}

	@Bean("girlIsGrandFatherAlive")
	public boolean grandFatherAlive() {
		System.out.println("Registered grandFatherAlive with spring");
		return false;
	}

	@Bean("instituteFees")
	public Double fees() {
		System.out.println("Registered fees with spring");
		Double double1 = new Double(1);
		return double1;
	}

	@Bean("bikeDownPaymentAmount")
	public Double downPayment() {
		System.out.println("Registered downPayment with spring");
		Double double1 = new Double(1);
		return double1;
	}

	@Bean("bikeInsuranceAmount")
	public Double insuranceAmount() {
		System.out.println("Registered insuranceAmount with spring");
		Double double1 = new Double(1);
		return double1;
	}

	@Bean("bikeTax")
	public Double tax() {
		System.out.println("Registered tax with spring");
		Double double1 = new Double(1);
		return double1;
	}

	@Bean("bikePrice")
	public Double price() {
		System.out.println("Registered price with spring");
		Double double1 = new Double(1);
		return double1;
	}

	@Bean("arrayListValues")
	public ArrayList arrayList() {
		System.out.println("Registered arrayList with spring");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		return (ArrayList) list;
	}

	@Bean("mapCityAndPincodes")
	public Map pincodes() {
		System.out.println("Registered pincodes with spring");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Mandya", 541326);
		map.put("Mysore", 578620);
		map.put("Hubli", 572201);
		map.put("Davangere", 515151);
		map.put("Hosadurga", 577527);
		return map;
	}
	   
}

