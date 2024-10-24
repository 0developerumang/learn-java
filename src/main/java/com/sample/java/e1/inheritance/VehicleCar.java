package com.sample.java.e1.inheritance;

public class VehicleCar extends Vehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		System.out.println(v.type + " has a top speed of : "+ v.topSpeed);
		v.start();
		v.info();
		Vehicle.info();
		
		Vehicle vc = new VehicleCar();
		// below code access data on vehicle reference so it will bring value from vehicle.
		// overriding is for methods and not for instance variables.
		System.out.println(vc.type + " has a top speed of : "+ vc.topSpeed);
		vc.start();
		vc.info();
		VehicleCar.info();
		
		VehicleCar c = new VehicleCar();
		System.out.println(c.type + " has a top speed of : "+ c.topSpeed);
	}

	// this a child class with instance variables and override methods.
	public int topSpeed = 200;
	public String type = "Car";
	
	public void start() {
		System.out.println(this.type + " Started!");
	}
	
	// here if we only change the return type and keep the method name same as parent class
	// it is still considered method overriding because return type is not part of method signature.
//	public int test() {
	public String test() {
		return "99";
	}
	
	// we cannot override static methods.
	// While a subclass can declare a method with the same name as a static method in its superclass,
	// this is considered method hiding, not overriding.
	public static void info() {
		System.out.println("Information about Car.");
	}

}
