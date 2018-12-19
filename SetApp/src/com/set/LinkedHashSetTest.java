package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set hs=new LinkedHashSet();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(90);
		hs.add(30);
		hs.add(50);
		hs.add(0);
		System.out.println(hs);
	}

}
