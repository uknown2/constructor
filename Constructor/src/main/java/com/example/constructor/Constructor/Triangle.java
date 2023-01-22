package com.example.constructor.Constructor;

public class Triangle {

	private String name;
	private String yourname;
	
	
	public Triangle(String yourname) {
		this.yourname = yourname;
	}
	public Triangle(String name, String yourname) {
		this.name = name;
		this.yourname = yourname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
}
