package com.sample.java.dsa1;

public class DSA1BigO {
//  DSA one course on youtube by Anuj Bhaiya Chanel
//	https://www.youtube.com/watch?v=N89PN_uyelU&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=1
// 	https://stackoverflow.com/questions/2307283/what-does-olog-n-mean-exactly

	// Time Complexity : Time taken by an algorithm as a function of the length of
	// Input.
	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 7, 9, 4, 8 };
		System.out.println(findElement(input, 4));
	}

	// in the worst case this function will execute for n elements.
	// ie. element not found or the element searching is on last index.
	// so the time complexity of below function is O(n);
	public static int findElement(int[] input, int element) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// few examples of big O based on function. find the upper bound, ignore the constants
	// f(n) = 3(n)2 + 5n = O(n2) i.e. O of n square.
	// f(n) = n + 100log n = O(n) i.e. upper bound is n because 100log n is smaller
	// f(n) = 3(n)3 + 4(n)5 = O(n5) i.e. n power 5
	// f(n) = 1000 = O(1) constant

	// there is a way to know which time complexity algo will be used for given problem on leetCode or any platform
	// 10 power 8 rule.
	// https://www.youtube.com/watch?v=cAlXlGVlPjE
	// in the same dsaone first video later part also explains this rule.
}
