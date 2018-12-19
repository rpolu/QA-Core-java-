package com.ram;

class BankException extends Exception {
	BankException(String message) {
		super(message);
	}
}

class Bank {
	float balance = 9000;

	void withdraw(float amt)throws BankException {
		if (amt > balance) {
			throw new BankException("Insucciesnt balance");
		}
		balance = balance - amt;
		System.out.println(" Wihdra success");
	}

}

public class TestCustom {
	public static void main(String[] args) throws BankException{
		Bank b = new Bank();
		b.withdraw(10000);
	}

}
