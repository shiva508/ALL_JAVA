package com.dasari.book.array;

import com.dasari.book.basic.BankAccount;

public class BankSimulator {
	public static void main(String[] args) {
		BankAccount account=new BankAccount(408);
		System.out.println(account.getBalance());
		account.deposit(504);
		System.out.println(account.getBalance());
		account.withdrow(508);
		System.out.println(account.getBalance());
	}
}
