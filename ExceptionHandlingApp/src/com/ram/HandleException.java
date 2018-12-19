package com.ram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Pleae enter a value");
		try {
			int a = scanner.nextInt();
			System.out.println(" Pleae enter b value");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println(" The result is :" + c);
		} catch (ArithmeticException e) {
			System.out.println(" Please dont enter b value as  zero");
		} catch (InputMismatchException e) {
			System.out.println(" Please enter only numeric values");
		} catch (Exception e) {
			System.out.println(" Problem occured . Please concat later .");
		} finally {
			scanner.close();
		}

	}

}
