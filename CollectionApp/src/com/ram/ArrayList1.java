package com.ram;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(20);
		al.add("rama");
		al.add(2);
		al.add(1);

		System.out.println(al);

		Object c = al.get(0);
		Object d = al.get(2);

		int x = (int) al.get(0);
		String y = (String) al.get(2);

		System.out.println(x);
		System.out.println(y);
		al.add(1, 50);
		System.out.println(al);

		al.remove(3);
		System.out.println(al);

	}

}
