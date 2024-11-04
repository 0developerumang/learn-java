package com.sample.java.e1.inheritance;

public class BlockChild extends BlockParent {

	{
		System.out.println("Instance block. Child");
	}
	static {
		System.out.println("Static block. Child");
	}
	BlockChild() {
		System.out.println("Constructor. Child");
	}
	
	void test() {
		System.out.println("Test method. Child");
	}
	
	public static void main(String[] args) {
		
		// static block will get executed first for parent and then for child.
		// even if we don't have anything in main method here both static blocks will be executed.
		// as soon as class is loaded
		
		// here we are creating instance of parent so parent instance block will execute.
		// Then it will call constructor. instance executes before constructor.
		System.out.println("------new Parent--------");
		BlockParent bp = new BlockParent();
		bp.test();
		
		System.out.println("\n------new Child--------");
		BlockChild bc = new BlockChild();
		bc.test();

		// execution will be based on what we are doing new() i.e. calling constructor for.
		// 1. static block parent (only once)
		// 2. static block child  (only once)
		// 3. parent instance block. Consider we called new on Child.
		// 4. parent constructor.
		// 5. child instance block.
		// 6. child constructor.
		System.out.println("\n------new Child--------");
		BlockParent bpc = new BlockChild();
		bpc.test();

	}
}
