package com.bank;

import com.dto.BankDto;

public interface Bank {

	void createAccount(BankDto bankDto);

	float withDram(int accno, float amt);

	void deposite(int accnum, float amt);

	BankDto getDetails(int accnum);

}
