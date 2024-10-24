package com.sample.java.e1.inheritance;

public class BlockParent {

	{
		System.out.println("Instance block. Parent.");
	}
	static {
		System.out.println("Staic block. Parent.");
	}
	
	BlockParent(){
		System.out.println("Constructor. Parent");
	}
	
	void test() {
		System.out.println("Test method. Parent");
	}
}
