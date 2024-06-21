package com.learning.beans;

public class WishMsgGenerator {

	private java.util.Date date;// ctr+shift+O

	// alt+shift+s
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	// business method

	public String generateWishMsg(String user) {
		// get current of the day
		int hours = date.getHours();
		if (hours > 12)
			return "Goood Morning" + user;
		else if (hours < 16)
			return "Goood Afternoon" + user;
		else if (hours < 20)
			return "Goood Evening" + user;
		else
			return "Goood Nighttttt" + user;

	}
}
