package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set hs = new HashSet<>();
		
		User u1 = new User();
		u1.setId(10);
		u1.setName("rama");

		User u2 = new User();
		u2.setId(10);
		u2.setName("rama");

		hs.add(u1);
		hs.add(u2);
		System.out.println(hs);
	}

}
