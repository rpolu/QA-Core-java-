package com.ram;
public class FlowOfExecution {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int[] x = {7};
			System.out.println(x[1]);
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
			System.out.println(5);
		}catch (Exception e) {
			System.out.println(100);
		}
		finally {
			System.out.println(6);//
		}
		System.out.println(7);

	}

}
