package com.ram;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class RetriveReverse {
	public static void main(String[] args) {
		List<Integer> l = new Vector();
		l.add(10);
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(0);
		l.add(1, 70);

		System.out.println(l);
		ListIterator<Integer> lt = l.listIterator();

		while (lt.hasNext()) {
			int x = lt.next();
			System.out.print(x + " ");

		}
		System.out.println();
		while (lt.hasPrevious()) {
			int x = lt.previous();
			System.out.print(x + " ");

		}

	}

}
