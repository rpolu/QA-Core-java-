package com.ram;

import java.util.Scanner;

public class RaisingException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Pleae enter a value");
		int a = scanner.nextInt();
		System.out.println(" Pleae enter b value");
		int b = scanner.nextInt();
		int c = a / b;
		System.out.println(" The result is :" + c);
		scanner.close();
	}
}
