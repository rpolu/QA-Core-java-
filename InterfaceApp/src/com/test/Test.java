package com.test;

import com.bank.ui.BannUiComntroller;
import com.dto.BankDto;

public class Test {
	public static void main(String[] args) {
		BannUiComntroller ui=new BannUiComntroller();
		BankDto dto = new BankDto();
		dto.setAccNum(1);
		dto.setName("FF");
		dto.setBalance(8999);
		dto.setAddress("Bangalore");
		ui.createAccount(dto);

	}

}
