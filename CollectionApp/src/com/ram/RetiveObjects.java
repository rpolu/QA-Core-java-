package com.ram;

import java.util.ArrayList;
import java.util.Iterator;

public class RetiveObjects {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(20);
		al.add("rama");
		al.add(2);
		al.add(1);
		System.out.println(al);
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
			if (ob.equals("rama")) {
				it.remove();
			}
		}
		System.out.println(al);
	}
}
