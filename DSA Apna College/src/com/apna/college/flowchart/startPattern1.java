package com.apna.college.flowchart;

import java.util.Scanner;

public class startPattern1 {

	public static void main(String[] args) {
		System.out.println("* * * *");
		System.out.println("* * *");
		System.out.println("* *");
		System.out.println("*");

		int a = 10, b = 17, c;
		c = a + b;
		System.out.println(c);

		// Input In Java

		Scanner sc = new Scanner(System.in);
//		String input=sc.next();
//		System.out.println(input);


		System.out.println("Enter full name");
		String fullname = sc.nextLine();
		System.out.println(fullname);

//		sum of A & b Using input

		System.out.println("Enter first Number");
		int i1 = sc.nextInt();

		System.out.println("Enter second Number");		
		int i2 = sc.nextInt();
		int sum = i1 + i2;
		System.out.println(sum);
	}
}
