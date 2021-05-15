package com.nt.compe;

public class Dotnet implements Course {

	public Dotnet() {
		System.out.println("Dotnet.0-param Constructor");
	}
	@Override
	public String courseDetails() {
		
		return "Dotnet course started";
	}

}
