package com.dasari.thread.deadlock;

public class Account {
	private int balance = 10000;

	public void deposit(int depositAmount) {
		balance+=depositAmount;
	}
	
	public void withdrow(int withdrowAmount) {
		balance-=withdrowAmount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void tranferMoney(Account account1,Account account2,int ammount) {
		account1.withdrow(ammount);
		account2.deposit(ammount);
	}
}
