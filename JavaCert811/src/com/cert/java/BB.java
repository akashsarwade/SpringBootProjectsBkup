package com.cert.java;

public class BB {
	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		update(A, B);
		System.out.println(A + " " + B);
	}

	public static void update(int X, int Y) {
		X = X + Y;
		Y = Y + X;
		System.out.println(X + " " + Y);
	}
}
