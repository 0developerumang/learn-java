package com.sample.java.e1.inheritance;

@FunctionalInterface
public interface ILambda {

	public void testMethod();
	
	public default void test() {
		System.out.println("Functionl interface can have default and static methods");
	}

}
