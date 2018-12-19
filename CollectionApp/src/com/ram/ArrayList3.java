package com.ram;

import java.util.List;
import java.util.Vector;

public class ArrayList3 {

	public static void main(String[] args) {
		List<Integer> l = new Vector();
		l.add(10);
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(0);
		l.add(1,70);
		System.out.println(l);
		l.add(1,70);
		System.out.println(l);
		for(int x:l) {
			System.out.println(x);
		}
	}

}
