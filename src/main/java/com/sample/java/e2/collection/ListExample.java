package com.sample.java.e2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

	public static List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	public List<String> strs = new ArrayList<>();

	public static void main(String[] args) {

		// list is usually a collection of same type of data. but we can store different objects in it too.
		// this won't be the case in real time.
		List test = new ArrayList();
		test.add(1);
		test.add("2");
		
		ListExample le = new ListExample();
		
		// https://www.javatpoint.com/difference-between-arraylist-and-linkedlist
        // 1. ArrayList internally uses a dynamic array to store the elements.
		// 2. Manipulation with ArrayList is slow because it internally uses an array.
		//    If any element is removed from the array, all the other elements are shifted in memory.
		// 3. Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.
		//    This is lazy loaded, meaning when we add first element to list it creates array of 10 size;
		//    we can provide initial capacity though.
		// 4. An ArrayList class can act as a list only because it implements List only.
		// 5. ArrayList is better for storing and accessing data.
		// To be precise, an ArrayList is a resizable array.

		List<String> arrayList = new ArrayList<>(2);
		arrayList.add("Hi");
		arrayList.add("Hello");
		arrayList.add("World");

		arrayList.remove(1); // removing element now arraylist has to shift all the subsequent elements to the position-1.
		arrayList.forEach(System.out::println);

		// 1. LinkedList internally uses a doubly linked list to store the elements.
		// 2. Manipulation with LinkedList is faster than ArrayList because it uses
		//    a doubly linked list, so no bit shifting is required in memory.
		// 3. There is no case of default capacity in a LinkedList.
		//    In LinkedList, an empty list is created when a LinkedList is initialized.
		// 4. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
		// 5. LinkedList is better for manipulating data.
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Hi");
		linkedList.add("Hello");
		linkedList.add("World");

		linkedList.remove(1);
		linkedList.forEach(System.out::println);

	}
}
