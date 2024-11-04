package com.sample.java.e1.inheritance;

public class IAnimalDog implements IAnimal {

	public String name = "Dog";
	
	@Override
	public void run() {
		System.out.println("Dog runs");
	}
	
	public void makeSound() {
		System.out.println("bhau bhau");
	}
	
	public void showName() {
		System.out.println("Name is : " + name);
	}
	
	public static void main(String[] args) {
		IAnimal iad = new IAnimalDog();
		iad.makeSound();
//		iad.showName(); // this method is not available here but available on name directly as it is static.
		System.out.println(iad.name + " with speed " + iad.speed);
		IAnimal.showName();
		System.out.println(IAnimal.speed);
	}

}
