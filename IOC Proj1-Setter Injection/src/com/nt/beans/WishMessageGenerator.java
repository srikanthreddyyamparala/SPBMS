package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	
	public WishMessageGenerator( ) {
	System.out.println("WishMessageGenerator.WishMessageGenerator():0-param Constructor");
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generteWishMessgae(String user) {
		System.out.println("WishMessageGenerator.generteWishMessgae()");
		int hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
	}
}
