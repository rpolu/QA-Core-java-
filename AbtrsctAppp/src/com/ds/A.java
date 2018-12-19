package com.ds;

public abstract class A {
	int a;
	A(int a){
		this.a=a;
	}
	public void display() {
		System.out.println(" from display() ");
	}

	public abstract void m1();

	public int hashCode() {
		return a;
	}

	public String toString() {
		return "B class Object";
	}
}
