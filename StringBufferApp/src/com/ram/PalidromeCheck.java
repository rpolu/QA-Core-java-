package com.ram;

public class PalidromeCheck {
	public static void main(String[] args) {
		String x = "ramav";
		StringBuffer stringBuffer = new StringBuffer(x);
		stringBuffer.reverse();
		String y = stringBuffer.toString();
		if(x.equals(y)) {
			System.out.println(" Palindrome ");
		}else {
			System.out.println("it is not palindrome");
		}
	}

}
