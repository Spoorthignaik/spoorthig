package com.xworkz.programs;

public class NumberRev {

	public static void main(String[] args) {

		int a = 2516;
		int mod = 0, mod1 = 0;
		int rev = 0;

		int count = 1, sum = 0;

		while (a != 0 && count <= 2) {

			mod = a % 10;

			rev = rev * 10 + mod;
			a = a / 10;
			count++;

		}
		System.out.println(rev);

		
		int temp = rev;

		while (temp != 0) {
			mod1 = temp % 10;
			sum = sum + mod1;
			temp = temp / 10;

		}
		System.out.println(sum);

		if (sum == 7 || sum == 8) {
			System.out.println("add two number");

		} else {
			System.out.println("not adding two numbers");
		}
	}

}
