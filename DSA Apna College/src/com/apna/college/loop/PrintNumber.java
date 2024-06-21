package com.apna.college.loop;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime Number Range");
		int range = sc.nextInt();

		int counter = 1;
		while (counter <= range) {
			System.out.print(counter + " ");
			counter++;

		}
		System.out.println();
	}
}
