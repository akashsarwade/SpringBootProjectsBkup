package com.cert.java;

public class Akash {

	public static void main(String[] args) {
//		int ar1[] = { 2, 4, 6, 8 };
//		int ar2[] = { 1, 3, 5, 7, 9 };
//		ar2 = ar1;
//		for (int e2 : ar2) {
//			System.out.print(" " + e2);
//		}
//
//		int[] array = { 1, 2, 3, 4, 5 };
//		System.arraycopy(array, 2, array, 1, 2);
//		System.out.print(array[1]);
//		System.out.print(array[4]);

		int nums1[] = new int[3];
		int nums2[] = { 1, 2, 3, 4, 5 };
		nums1 = nums2;
		for (int x : nums1) {
			System.out.print(x + " , ");
		}

	}
}
