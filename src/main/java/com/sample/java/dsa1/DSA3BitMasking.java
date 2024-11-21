package com.sample.java.dsa1;

public class DSA3BitMasking {

	// https://www.youtube.com/watch?v=h7meukyY_bQ&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=3
	public static void main(String[] args) {
		System.out.println("16,5 find:" + Integer.toBinaryString(16) + " " + findIthBit(16, 5));
		System.out.println("19,1 find:" + Integer.toBinaryString(19) + " " + findIthBit(19, 1));
		System.out.println("19,3 find:" + Integer.toBinaryString(19) + " " + findIthBit(19, 3));
		
		System.out.println("19,3 set:" + Integer.toBinaryString(19) + " " + setIthBit(19, 3));
		System.out.println("16,1 set:" + Integer.toBinaryString(16) + " " + setIthBit(16, 1));
		
		System.out.println("19,2 clear:" + Integer.toBinaryString(19) + " " + clearIthBit(19, 2));
		System.out.println("16,5 clear:" + Integer.toBinaryString(16) + " " + clearIthBit(16, 5));
		
		System.out.println("3,5 bitsChange: " 
		+ Integer.toBinaryString(3) + " "
		+ Integer.toBinaryString(5) + " "
		+ findNumberOfBitsToChangeAtoB(3, 5));

		System.out.println("7 setBits:" + Integer.toBinaryString(7) + " " + findNoOfSetBits(7));
		System.out.println("7 countSetBits:" + Integer.toBinaryString(7) + " " + countSetBits(7));
		
		System.out.println("7 countSetBitsBetter:" + Integer.toBinaryString(7) + " " + countSetBitsBetter(7));
		System.out.println("8 countSetBitsBetter:" + Integer.toBinaryString(8) + " " + countSetBitsBetter(8));
	}

	public static int findIthBit(int a, int i) {
		int mask = 1 << i - 1;
		int ans = a & mask;

		// we are creating a mask here and will do & with the mask if no. is non zero
		// means bit is 1 and if 0 then bit is 0
//		System.out.println(Integer.toBinaryString(a));
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Integer.toBinaryString(mask));
		return ans > 0 ? 1 : 0;
	}

	public static String setIthBit(int a, int i) {
		int mask = 1<<i-1;
		int ans = a | mask;
//		System.out.println(ans);
		return Integer.toBinaryString(ans);
	}
	
	public static String clearIthBit(int a, int i) {
		// we need to invert the mask to make the desired bit 0 and all other 1
		// so that doing & with given bits will clear the ith bit.
		int mask = 1<<i-1;
		mask = ~mask; // inverted all bits so 0100 will become 1011
		int ans = a&mask;
		return Integer.toBinaryString(ans);
	}
	
	public static int findNumberOfBitsToChangeAtoB(int a, int b) {
		// a^b will give us 1's in all the position where bits are different.
		// then just return how many 1's are there in result.
		// after a^b question becomes how many set bits are there in given no.
		int res = a^b;
		res = (int)Math.log(res)+1; // find no of set bits in given int.
		return res;
	}
	
	public static int findNoOfSetBits(int a) {
		return Integer.bitCount(a);
	}

	static int countSetBits(int n)
	{
	    // base case
	    if (n == 0)
	        return 0;
	    else
	        // if last bit set add 1 else add 0
	        return (n & 1) + countSetBits(n >> 1);
	}
	
	static int countSetBitsBetter(int a) {
		int count = 0;
		if(a==0)
			return 0;
		else
			return count+1 + countSetBitsBetter(a&a-1);
	}
}
