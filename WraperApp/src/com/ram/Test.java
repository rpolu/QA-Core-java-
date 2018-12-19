package com.ram;

public class Test {
	public static void main(String[] args) {
		int a=10;
		Integer b=new Integer(12);
		Integer m=a;// auto boxing // primitive to wrapper
		int x=new Integer(45);// auto unboxing // wrapper to primitive
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(m);
		System.out.println(x);
	}

}
