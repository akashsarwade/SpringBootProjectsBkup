package com.cert.java;

public class VS {

	public static void main(String[] args) {
		
	
	int Obj p;

	p=new int Obj();

	int Obj q = new intObj();
	
	q.setInt(20);//q=20

	p.setInt(q.getInt()); //p==20
	// line 1
	p.setInt(15);//p=15

	q=p; //q=15
	// line 2
	p=null;//p=-

	System.out.print(p.getInt()); // line 3

}
}