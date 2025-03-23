package com.sample.java.dsa1;

import java.util.Arrays;

public class DSA4BitXORProblems {

	// https://www.youtube.com/watch?v=bTauscvOymA&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=4

	public static void main(String[] args) {

		// if two bits are same 0 or 1 then xor will be 0, different bit then 1.
		// also 5^5 5xor5 will be 0;
		// 1. 4 ^ 4 = 0 any number xor with itself is 0;
		// 2. 0 ^ n = n any number xor with 0 is number itself;
		int[] input = {5,4,1,3,5,1,3};
		System.out.println(nonRepeatingFromArrayRepeatingTwice(input));
		int[] input2 = {5,4,1,4,3,5,1,2};
		int[] res = twoNonRepeatingFromArrayRepeatingTwice(input2);
		System.out.println("The non-repeating elements are " + res[0] + " and " + res[1]);
		int a[] = { 6, 2, 5, 2, 2, 6, 6 };
		System.out.println(nonRepeatingFromArrayRepeatingThrice(a, 3));
	}

	// find only non repeating element in an array where every element repeats twice.
	// 1. simplest solution is loop twice on an array and find the element. but O(n^2)
	// 2. better is to use hashmap or hashset and add elements and if found already remove.
	//    last element remaining in hashset is the answer. here we use space O(n)
	// 3. use bitwise xor operator. [5,4,1,4,5]
	//    5^4^1^4 here 4^4 will be 0 and 5^1^0 = 5^1 so xor all elements and the remaining no. is answer. 
	public static int nonRepeatingFromArrayRepeatingTwice(int[] input) {
		int res = 0;
		for(int i=0; i<input.length; i++) {
			res = res^input[i];
		}
		return res;
	}

	// https://www.geeksforgeeks.org/find-two-non-repeating-elements-in-an-array-of-repeating-elements/
	public static int[] twoNonRepeatingFromArrayRepeatingTwice(int[] nums) {
		// Pass 1:
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff = diff & -diff;

        // Pass 2:
        int[] rets = new int[2]; // this array stores the two numbers we will return
        Arrays.fill(rets, 0);
        for (int num : nums) {
            if ((num & diff) == 0) { // the bit is not set
                rets[0] ^= num;
            } else { // the bit is set
                rets[1] ^= num;
            }
        }

        // Ensure the order of the returned numbers is consistent
        if (rets[0] > rets[1]) {
            int temp = rets[0];
            rets[0] = rets[1];
            rets[1] = temp;
        }

        return rets;
	}
	
	public static int nonRepeatingFromArrayRepeatingThrice(int[] a, int k) {
		// Create a count array to store count of
        // numbers that have a particular bit set.
        // count[i] stores count of array elements
        // with i-th bit set.
        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];
        int n = a.length;
 
        // AND(bitwise) each element of the array
        // with each set digit (one at a time)
        // to get the count of set bits at each
        // position
        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++)
                if ((a[j] & (1 << i)) != 0)
                    count[i] += 1;
 
        // Now consider all bits whose count is
        // not multiple of k to form the required
        // number.
        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);
 
        // Before returning the res we need
        // to check the occurrence  of that
        // unique element and divide it
        res = res / (n % k);
 
        return res;
	}
}
