package com.bank.ui;

import com.bank.Bank;
import com.dto.BankDto;

public class BannUiComntroller {
	Bank bank;

	public void createAccount(BankDto bankDto) {
		bank.createAccount(bankDto);
	}

	public float withDram(int accno, float amt) {
		return bank.withDram(accno, amt);
	}

	public void deposite(int accnum, float amt) {
		bank.deposite(accnum, amt);
	}

	public BankDto getDetails(int accnum) {
		return bank.getDetails(accnum);
	}

}
