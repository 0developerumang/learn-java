package com.sample.java.prog.recursion;

public class StringPalindrome {

	// https://www.youtube.com/watch?v=mEBEw_xScsE&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=10
	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		String s1 = "abbba";
		boolean r1 = sp.isStringPalindrome(s1.split(""), 0, s1.length()-1);

		String s2 = "abcdcb";
		boolean r2 = sp.isStringPalindrome(s2.split(""), 0, s2.length()-1);

		String s3 = "xyyx";
		boolean r3 = sp.isStringPalindrome(s3.split(""), 0, s3.length()-1);

		String s4 = "";
		boolean r4 = sp.isStringPalindrome(s4.split(""), 0, s4.length()-1);

		System.out.println("String \""+ s1 + "\" is palindrome " + r1);
		System.out.println("String \""+ s2 + "\" is palindrome " + r2);
		System.out.println("String \""+ s3 + "\" is palindrome " + r3);
		System.out.println("String \""+ s4 + "\" is palindrome " + r4);

		System.out.println(s1 + "\" is palindrome "+sp.isStringPalindrome2(s1, 0, s1.length()-1));
		System.out.println(s1 + "\" is palindrome "+sp.isStringPalindrome2(s2, 0, s2.length()-1));
		System.out.println(s1 + "\" is palindrome "+sp.isStringPalindrome2(s3, 0, s3.length()-1));
		System.out.println(s1 + "\" is palindrome "+sp.isStringPalindrome2(s4, 0, s4.length()-1));

	}
	
	public boolean isStringPalindrome(String[] s, int start, int end) {
		if(start==end || end==-1) { // or we can keep like start >= end to handle -1 and even length strings.
			return true;
		}
		return s[start].equals(s[end]) && isStringPalindrome(s, start+1, end-1);
	}

	public boolean isStringPalindrome2(String s, int start, int end) {
		if(start>=end) { // to handle the even length strings like 4, 8 etc
			return true;
		}
		if(s.charAt(start)!=s.charAt(end)) {
			return false;
		}
		return isStringPalindrome2(s, start+1, end-1);
	}
}
