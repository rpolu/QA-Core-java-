package com.array;

public class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 11, 90 };
		for (int g : arr)
			System.out.print(g + " ");

		int size = arr.length;
		int mid = size / 2;
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[size - 1 - i];
			arr[size - 1 - i] = temp;
		}

		System.out.println();
		for (int g : arr)
			System.out.print(g + " ");

	}

}
