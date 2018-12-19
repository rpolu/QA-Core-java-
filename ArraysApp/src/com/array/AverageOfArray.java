package com.array;

public class AverageOfArray {
	public static void main(String[] args) {
		int[] arr = { 5, 5, 10, 20 };
		int sumOfArray = 0;
		for (int k : arr) {
			sumOfArray = sumOfArray + k;
		}
		System.out.println(sumOfArray);
		int avergae = sumOfArray / arr.length;
		System.out.println(avergae);
	}
}
