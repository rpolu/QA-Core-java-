package com.bank.sbi;

import com.bank.Bank;
import com.dto.BankDto;

public class SBIBank implements Bank {
	double balance = 500;

	public void createAccount(BankDto bankDto) {
		System.out.println(" Account craeted Successfully");
	}

	@Override
	public float withDram(int accno, float amt) {
		if (accno == 1) {
			return 8000;
		}
		return 0;
	}

	public void deposite(int accnum, float amt) {
		balance = balance + amt;
	}

	@Override
	public BankDto getDetails(int accnum) {
		if (accnum == 1) {
			BankDto dto = new BankDto();
			dto.setAccNum(1);
			dto.setName("FF");
			dto.setBalance(8999);
			dto.setAddress("Bangalore");
			return dto;

		}
		return null;
	}

}
