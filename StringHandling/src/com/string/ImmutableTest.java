package com.string;

public class ImmutableTest {

	public static void main(String[] args) {
		String x = "rama";
		x.concat("mohan");
		System.out.println(x);//

		x = x.concat("mohan");

		String y = x.concat("mohan");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);

	}

}
