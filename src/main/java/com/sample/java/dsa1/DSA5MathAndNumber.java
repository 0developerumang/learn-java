package com.sample.java.dsa1;

public class DSA5MathAndNumber {

	// https://www.youtube.com/watch?v=69jsFIMINpI&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=5
	public static void main(String[] args) {
		System.out.println(factorialOf(12));
		System.out.println(trailingZerosInFactorialOf(12));
		System.out.println(trailingZerosInFactorialOf(30));
		System.out.println(isNumberPalindrome(121));
		System.out.println(isNumberPalindrome(123));
		System.out.println(isNumberPalindrome(404));
	}

	public static int factorialOf(int n) {
		int res = 1;
		for (int i = n; i > 0; i--) {
			res = res * i;
		}
		return res;
	}

	// we cannot actually calculate the factorial to find trailing zeros because
	// if we have 243! it goes to a very big number.
	// for this we can find how many 5 and 2 pairs(makes 10) are there.
	// for example for 12! = 479001600
	// here 1*2*3*4*...12.. = there are 2 5*2 pairs.
	// number of 2s = 2, 4(2*2), 6(2*3), 8(2*2*2),..
	// number of 5s = 5, 10(5*2) = 2
	// number of 5s will always be less then number of 2s. so we just have to find
	// number of 5s.
	// 12/5 = 2.4 floor value = 2. answer is 2. formula = n/5 = x and floor of x.
	// but here one case is missing consider the number is 30. 30/5 = 6
	// which is wrong because in 25 there are two 5s. so total 5s in 30 is 7.
	// so now formula is n/5 + n/25 (if n is >= 25) + n/125(if n>=125) + n/625 ..
	public static int trailingZerosInFactorialOf(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + n / i;
		}
		return res;
	}
	
	public static boolean isNumberPalindrome(int n) {
		int revNo = 0;
		for(int i=n; i>0; i=i/10) {
			int rem = i%10;
			revNo = revNo * 10 + rem;
		}		
		return n==revNo;
	}
}
