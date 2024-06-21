package com.learning.setter.injection
;

import java.sql.Date;

public class WishMsgGenerator {
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public WishMsgGenerator(Date date) {
		super();
		this.date = date;
		
		
	}
	
	

}
