package com.xworkz.javaPrograms;

public class Company {

		public String name;
		public char type;

		public Company() {

		}

		public Company(String name, char type) {
			this.name = name;
			this.type = type;

		}

		public void piller() {

			System.out.println("running piller");
		}

		public void showOff() {

			System.out.println(this.name);
			System.out.println(this.type);

		}

	}

