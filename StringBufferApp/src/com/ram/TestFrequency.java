package com.ram;

public class TestFrequency {

	public static void main(String[] args) {
		String x = "ramamohana";

		char ch = 'o';
		int count = 0;
		for (char c : x.toCharArray()) {
			if (ch == c) {
				count++;
			}
		}
		System.out.println(count);

	}

}
