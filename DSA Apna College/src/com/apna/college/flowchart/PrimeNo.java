package com.apna.college.flowchart;

public class PrimeNo {

	public static void main(String[] args) {

		int n = 9;
		int div = 2;
		while (div > n) {
			if (n % div == 0) {
				System.out.println("Not Prime Number");
			} else {
				div = div + 1;
			}
			System.out.println("Prime Number");

		}
	}
}
