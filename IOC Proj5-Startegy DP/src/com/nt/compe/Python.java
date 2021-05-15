package com.nt.compe;

public class Python implements Course {

	public Python() {
		System.out.println("Python.0-param Constructor");
	}
	@Override
	public String courseDetails() {
		
		return "Python course started";
	}

}
