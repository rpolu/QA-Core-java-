package com.ram;

class A {

	void m1() {
		System.out.println(" good");
	}

}

class B extends A {

	void m1() {
		System.out.println(" bad");
	}

}

public class InheritanceTest {

	public static void main(String[] args) {
		A a=new B();
		a.m1();// Dynmic polymophism

	}

}
