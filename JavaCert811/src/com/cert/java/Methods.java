package com.cert.java;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ta="A";
		
		ta=ta.concat("B");//ta=ab
		String tb="C";//tb=c
		ta=ta.concat(tb);//ta=abc
		ta.replace('C', 'X');//ta=abd
		System.out.println(ta);
		ta=ta.concat(tb); //ta=abdc
		System.out.println(ta);
		
		
//		@ 12  incorrect
		
		
		
		String a="Akash";
		a.replace("A", "v");
		System.out.println(a);
		
		
		  String str = "oooooo-hhhh-oooooo";  
	        String rs = str.replace("h","s"); // Replace 'h' with 's'  
	        System.out.println(rs);  
	        rs = rs.replace("s","h"); // Replace 's' with 'h'  
	        
		
		
	}

}
