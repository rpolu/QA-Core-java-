package com.ram;
class SubDemo {
	final int x=10;
	public void m1() {
		System.out.println(x);
	}
}

public class TestOverRiding {
	public static void main(String[] args) {
		SubDemo sd = new SubDemo();
		sd.m1();
	}

}
