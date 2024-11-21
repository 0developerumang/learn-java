package com.sample.java.dsa1;

public class DSA2BitManipulation {

	// https://www.youtube.com/watch?v=Db8OmMfzwl8&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=2
	// Bit operations are fast because they are performed directly on binary.
	
	public static void main(String[] args) {
		System.out.println(1&2); // & and operator : if any of bit is 0 it's 0. 1 only if both 1
		// 1&2 = 0001 & 0010 = 0000 = 0
		System.out.println(1&3);
		// 1&3 = 0001 & 0101 = 0001 = 1
		
		System.out.println(1|2); // | or operator : if any of bit is 1 it's 1. 0 only if both 0
		
		System.out.println(1^2); // ^ xor operator: if both bit different then 1. it both bit same then 0.
		
		System.out.println(~3); // ~ inverse operator (1's complement): inverses the bits.
		// here 2 is 0011 (for 32 bits it could be 000000000011 so inverse will do 1111111111100)
		System.out.println(Integer.toBinaryString(-4)); // that's why inverse of 3 is -4
		
		System.out.println(12>>2); // 12 right shifted 2 times. 1100 shifted two times is 0011 = 3.
		System.out.println(8<<2); // 8 left shifted 2 times.
		
		
		// important
		// if we right shift any number by 1 it divide it by 2.
		System.out.println(12>>1);
		System.out.println(9>>1);

		// if we left shift any number by 1 it multiplies it by 2.
		System.out.println(12<<1);
		System.out.println(9<<1);

		// to know if number is even or odd we will mask it with 1(& with 1) and see
		// if result is 0 then number is even.
		// if result is 1 then number is odd.
		System.out.println(3&1);
		System.out.println(4&1);
		
		// to swap two numbers using bitwise operator
		// doing xor three times swaps two variables.
		int a = 5;
		int b = 7;
		a = a^b;
		System.out.println("a = " + a + " b = " + b);
		b = a^b;
		System.out.println("a = " + a + " b = " + b);
		a = a^b;
		System.out.println("a = " + a + " b = " + b);
	}
}

