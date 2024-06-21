package com.cert.java;

class Product {
	double price;
}

public class Test {
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {
//		Product prt = new Product();
//		prt.price = 200;
//		double newPrice = 100;
//		Test t = new Test();
//		t.updatePrice(prt, newPrice);
//		System.out.println(prt.price + " : " + newPrice);
//
//		int n[][] = { { 1, 3 }, { 2, 3 } };
//		for (int i = n.length - 1; i >= 0; i--) {
//			for (int y : n[i]) {
//				System.out.print(y);
//			}
//		}

		int nums1[] = new int[3];
		int nums2[] = { 1, 2, 3, 4, 5 };
		nums1 = nums2;
		for (int x : nums1) {
			System.out.print(x + " , ");
		}

	}

	public boolean doStuff() {
		// TODO Auto-generated method stub
		return false;
	}
}
