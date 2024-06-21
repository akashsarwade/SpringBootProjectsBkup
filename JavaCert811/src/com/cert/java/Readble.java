package com.cert.java;

public interface Readble {

	interface Readable {
		public void readBook();

		public void setBookMark();
	}

	abstract class Book implements Readable { 
		// line n1
		public void readBook() {
		} // line n2
	}

	 class EBook extends Book { 
		// line n3
		public void readBook() {
		} 
		@Override
		public void setBookMark() {
			// TODO Auto-generated method stub
			
		}// line n4
	}

	
	Book book1 = new EBook();
	book1.readBook();
	
}
}
