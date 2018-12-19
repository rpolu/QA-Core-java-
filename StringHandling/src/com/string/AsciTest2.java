package com.string;

public class AsciTest2 {
	public static void main(String[] args) {
		String x = "ram23HH";
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			int charInt = ch;
			if (charInt >= 48 && charInt <= 57) {
				System.out.println(ch + " is numeric");
			} 

		}

	}

}
