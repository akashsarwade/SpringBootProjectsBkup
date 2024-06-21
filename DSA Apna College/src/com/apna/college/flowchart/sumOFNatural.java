package com.apna.college.flowchart;

public class sumOFNatural {

	public static void main(String[] args) {

		int sum = 0, value = 1;
		int n = 3;
		while (value <= n) {
			sum = sum + value;
			value = value + 1;
		}
		System.out.println(sum);

	}
}
