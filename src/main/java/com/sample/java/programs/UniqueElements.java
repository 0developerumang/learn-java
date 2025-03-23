package com.sample.java.programs;

import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5 };
		System.out.println(getUniqueElements(arr));
		System.out.println(arr[-1]==arr[0]);
	}

	private static int getUniqueElements(int[] arr) {
		int x = 0;
		int[] res = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != arr[i-1]) {
//				arr[x] = arr[i];
//				x++;
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
            // If it's the first element or different from the previous one, add it
            if (i == 0 || arr[i] != arr[i - 1]) {
                res[x++] = arr[i];
            }
        }
		
		Arrays.stream(res)
        .forEach(e -> System.out.print(e + " "));
		
        return Arrays.copyOf(res, x).length;
	}

}
