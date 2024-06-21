package com.apna.college.flowchart;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in );
		float a=25.33f;
		int b=(int)a;// this is called type casting explicitly
		System.out.println(b);
		
		double d=786.34;
		int d1=(int)d;//here we loss data i e 34 will not print after ty
		System.out.println(d1);
		
		
		
		long l= 278987654555367l;
		int a2=(int)l;
		System.out.println(a2);
		
		
		char ch='a';
		int num=(int)ch;
		System.out.println(num);// return ASCII value of a 
		
		
	}
}
