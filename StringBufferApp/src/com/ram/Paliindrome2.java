package com.ram;

public class Paliindrome2 {
	public static boolean chelPalindrome(String x) {
		int left = 0;
		int right = x.length() - 1;
		while (right > left) {
			if (x.charAt(left) != x.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String x="rara";
		boolean flag=chelPalindrome(x);
		if(flag) {
			System.out.println(" Palindome");
		}else {
			System.out.println(" not Palidrome");
		}
		

	}

}
