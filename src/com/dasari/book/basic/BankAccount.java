package com.dasari.book.basic;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double depositAmmount) {
		this.balance=this.balance+depositAmmount;
	}
	
	public void withdrow(double withdrow) {
		this.balance=this.balance-withdrow;
	}

	public double getBalance() {
		return balance;
	}

}
