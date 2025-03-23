package com.sample.java.dsa1;

import java.util.Arrays;

public class DSA6EuclidGCDPrimeNumbers {

	// https://www.youtube.com/watch?v=dyrRM8dTEus&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=6
	public static void main(String[] args) {
		boolean primeNumbers[] = seiveOfEratosthenes(20);
		for(int i=0; i<primeNumbers.length; i++) {
			System.out.println(i + " is Prime " + primeNumbers[i]);
		}
		System.out.println(findGCD(15, 27));
		System.out.println(findGCD(24, 72));
		System.out.println(findGCD(24, 60));
		System.out.println(findGCD(60, 24));

	}

	// find all prime numbers between from 1 to n given n.
	// one way to do it is we get all the numbers one by one and then see if it is prime or not and fill the array.
	// to find prime number we can see if we can divide the number n from 2 to sqrt(n) if we can then no. is not prime.
	// but doing this for k numbers would make k*sqrt(n) time complex.
	// we can do below method to find numbers instead.
	// we will remove all the number from array of 1 to n that are factors of 2 then 3 then 4 etc.. upto sqrt(n)
	// this way it will remove non prime numbers.
	// seive meaning garani, chhanni
	public static boolean[] seiveOfEratosthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false; // 0 index so that we can match n 1 = arrays 1 index. 
		isPrime[1] = false; // 1 is not prime so mark it as false;
		// i*i <=n // meaning i <= sqrt(n)
		for(int i=2; i*i<=n; i++) {
			for(int j = 2*i; j<n; j+=i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}

	// GCD find the Greatest common divisor
	// https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
	// As per Euclidean Algo to find GCD of two numbers a and b.
	// GCD(a, b) = GCD(a-b, b) if a > b;
	// If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
	// If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
	// the same things is
	// GCD(a, b) = GCD(b, a%b);
	static int findGCD(int a, int b) {
		// one liner
		// return a%b == 0 ? b : findGCD(b, a%b);
		if(b == 0) return a;
		return findGCD(b, a%b);
	}
}

