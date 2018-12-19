package com.ram;

class A {
	void m1() {
		System.out.println(" from m1()");
	}
}

public class NullPonterExp {

	public static void main(String[] args) {
		A a = null;
		a.m1();

	}

}
