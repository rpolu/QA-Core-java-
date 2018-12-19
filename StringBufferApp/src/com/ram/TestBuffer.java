package com.ram;

public class TestBuffer {

	public static void main(String[] args) {
		String x = "rama";
		x.concat("mohan");
		System.out.println(x);

		StringBuffer b = new StringBuffer("rama");
		b.append("mohan");
		String y = b.toString();
		
		
		
		System.out.println(y);
		System.out.println(b);
		
		b.reverse();
		System.out.println(b);

	}
}
