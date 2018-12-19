package com.array;

public class BasicArray {

	public static void main(String[] args) {
		int[] arr = { 45, 89, 30 };
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("*************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**************");
		for(int x:arr) {
			System.out.println(x);
		}

	}

}
