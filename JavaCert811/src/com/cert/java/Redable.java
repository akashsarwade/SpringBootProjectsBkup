package com.cert.java;

public interface Redable {
	
	public void readBook();
	public void setBookMark();

}
abstract class Book implements Redable{
	
	public void readBook() {
		
	}
}

abstract class Ebook extends Book{
	
	public void readBook() {
		
	}
}