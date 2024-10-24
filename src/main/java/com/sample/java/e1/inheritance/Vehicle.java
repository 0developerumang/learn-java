package com.sample.java.e1.inheritance;

public class Vehicle {

	// this a parent class with instance variables and methods.
	public int topSpeed = 100;
	public String type = "Vehicle";
	
	public void start() {
		System.out.println(this.type + " Started!");
	}
	
	public String test() {
		return "Test method in vehicle";
	}
	
	public static void info() {
		System.out.println("Information about Vehicle");
	}
}
