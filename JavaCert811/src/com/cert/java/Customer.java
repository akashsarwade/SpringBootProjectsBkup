package com.cert.java;

public class Customer {
	
//	
//	public void useEle(double kwh) {
//		acc.addEle(kwh);	
//	}
	
	public static void main(String[] args) {
		
		ElectricAcc acc=new ElectricAcc();
		acc.addEle(4);
	
			
	}
	
}

 class ElectricAcc{
	
	 private double kwh;
	 private double rate=0.07;
	 private double bill;
	 
	 public void addEle(double kwh) {
		 this.kwh=kwh;
		 this.bill=this.kwh*this.rate;
	 }
}