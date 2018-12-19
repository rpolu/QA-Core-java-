package com.string;
public class CreateObject {
	public static void main(String[] args) {
		String x=new String("rama");// in heap // c p in scp also
		System.out.println(x);// o/p= rama
		String y="rama";// scp 
		System.out.println(y);
	}

}
