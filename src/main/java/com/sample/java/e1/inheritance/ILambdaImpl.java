package com.sample.java.e1.inheritance;

public class ILambdaImpl {

	public static String s = "class member";
	public static void main(String[] args) {
		
		int i = 10;
		ILambdaImpl il = new ILambdaImpl();

		il.checkLambda(new ILambda() {
			@Override
			public void testMethod() {
				System.out.println("Lambda is basically short form of this. It is anonymous inner class. " + i);
//				i = 20; // we cannot change i's value here. we can only access.
				s = "changed"; // we can change member variable here
			}
		});

		il.checkLambda(()->{
			System.out.println("Lambda function. Method passed as argument. " + s);
//			i = 20; // we cannot change i's value here.
			s = "changed again"; // we can change member variable here
		});
		
		// Local variable i defined in an enclosing scope must be final or effectively final.
		// This is happening because we are accessing i variable from within anonymous inner class,
		// what happens deep inside is that another copy of variable is created and will be used inside the anonymous inner class,
		// so for data consistency the compiler will try restrict you from changing the value of i
		// so that's why its telling you to set it to final.
		
		il.changeInt(i);
		System.out.println(i);
	}
	
	public void checkLambda(ILambda iLambda) {
		iLambda.testMethod();
	}
	
	public void changeInt(int i) {
		i = 2000;
	}

}
