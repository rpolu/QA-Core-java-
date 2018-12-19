package com.ram;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "hi ram mohan xyz";
		StringTokenizer stk = new StringTokenizer(str, " ");
		while (stk.hasMoreTokens()) {
			String st = stk.nextToken();
			System.out.println(st);
		}
	}
}
