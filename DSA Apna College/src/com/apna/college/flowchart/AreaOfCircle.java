package com.apna.college.flowchart;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float area = 3.13f;
		System.out.println("Enter Radious");
		float rad = sc.nextFloat();
		float result = area * rad * rad;
		System.out.println(result);
	}
}
