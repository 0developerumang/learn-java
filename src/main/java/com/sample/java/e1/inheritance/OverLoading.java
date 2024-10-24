package com.sample.java.e1.inheritance;

public class OverLoading {

	// Overloading: This occurs when two or more methods in the same class share
	// the same name but have different parameters. It’s a compile-time concept.

	// Overriding: In this case, a subclass provides a specific implementation
	// for a method already defined in its superclass. It’s a runtime concept.

	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		System.out.println(o.add(10,20));
		System.out.println(o.add(10.25,20));
	}
	
	public double add(double a, int b) {
		return a+b;
	}
	
	public double add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b, double c) {
		return a+b+c;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	// if we only change return type then it is not method overloading.
	// return type is not part of method signature.
//	public double multiply(int a, int b) {
	public double multiply(int a, double b) {
		return a*b;
	}
}
