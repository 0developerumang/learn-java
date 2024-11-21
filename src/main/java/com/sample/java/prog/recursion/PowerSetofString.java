package com.sample.java.prog.recursion;

public class PowerSetofString {

	// https://www.youtube.com/watch?v=mEBEw_xScsE&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=10
	public static void main(String[] args) {
		PowerSetofString ps = new PowerSetofString();
		ps.printPowerSet("abc", "", 0);
	}

	public void printPowerSet(String s, String current, int i) {
		if(i==s.length()) {
			System.out.println(current);
			return;
		}
		// consider string "a" so ans is "" and "a"
		// edither we apend "" (basecase) or we don't
		// consider string "ab" either we append b to a or don't then a, ab
		printPowerSet(s, current+s.charAt(i), i+1); // append and move on
		printPowerSet(s, current, i+1); // don't append and move on
	}
}
