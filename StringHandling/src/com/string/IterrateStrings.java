package com.string;

public class IterrateStrings {
	public static void main(String[] args) {
		String x = "ramamohan";
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		for (char ch : x.toCharArray()) {
			System.out.print(ch);
		}
		System.out.println();
		for(int i=x.length()-1;i>=0;i--) {
			System.out.print(x.charAt(i));
		}
	}
}
