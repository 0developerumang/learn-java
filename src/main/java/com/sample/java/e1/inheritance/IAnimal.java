package com.sample.java.e1.inheritance;

public interface IAnimal {

	String type = "Mammal";
	public int speed = 100;
	public static String name = "Animal";
	public static final String color = "brown";
	// by default Interface member variables are final and static, whether we mention it or not.
	// all four above statements are same.
	
	// after java8 interfaces can have default methods. we don't need to implement these methods.
	// we can implement these methods if we want to.
	// these were introduced to maintain backward compatibility.
	// consider list interface they introduced forEach method on list interface so now older versions of java may break.
	// to avoid it they added default forEach() method in List interface and implement in required classes.
	default public void makeSound() {
		System.out.println("Interface Default Method.");
	}
	
	// after java8 interfaces can have static methods too.
	public static void showName() {
		System.out.println("Name is : " + name);
	}
	
	public void run();
	
}
