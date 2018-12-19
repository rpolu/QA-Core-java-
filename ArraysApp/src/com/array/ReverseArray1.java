package com.array;

public class ReverseArray1 {

	public static void main(String[] args) {
		int[] arr = { 34, 23, 11, 90 };
		for (int g : arr)
			System.out.print(g + " ");
		int[] newArray = new int[arr.length];
		int k = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newArray[k] = arr[i];
			k = k + 1;
		}
		System.out.println();
		for (int g : newArray)
			System.out.print(g + " ");

	}

}
