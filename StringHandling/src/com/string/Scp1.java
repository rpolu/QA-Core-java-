package com.string;

public class Scp1 {

	public static void main(String[] args) {
		String a = "xyz";
		String b = "xyz";
		String c = "xyz";
		if (a == c) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		String d=new String("xyz");
		String e=new String("xyz");
		if (e == d) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		
		System.out.println(a.equals(b));
		System.out.println(d.equals(e));

	}

}
