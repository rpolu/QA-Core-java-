package com.ram;

import java.util.ArrayList;

public class RetriveEnhanceforloop {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(20);
		al.add(90);
		al.add(2);
		al.add(1);
		System.out.println(al);
		for(int x:al) {
			System.out.println(x);
		}
	}

}
