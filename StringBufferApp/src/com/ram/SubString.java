package com.ram;

public class SubString {
	public static void main(String[] args) {
		String x = "ramamohan";
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 5));

		String y = "rama";
		String k = "Rama";
		System.out.println(y.equals(k));
		System.out.println(y.equalsIgnoreCase(k));

		String v = " rama ";
		String z = "rama";

		System.out.println(v.trim().equals(z.trim()));

	}

}
