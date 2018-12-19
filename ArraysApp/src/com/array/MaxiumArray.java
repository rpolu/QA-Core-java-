package com.array;

public class MaxiumArray {

	public static void main(String[] args) {
		int[] arr = { 78, 90, 3, 800, 70, 900 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		for (int x : arr) {
			if (x > max) {
				max=x;
			}
		}
		
		System.out.println(max);

	}

}
