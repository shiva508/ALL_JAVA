package com.dasari.thread.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockRunner {

	private Account account1 = new Account();
	private Account account2 = new Account();
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	public void acquireAccountLocks(Lock firstLock,Lock secondLock) {
		while (true) {
			boolean isFirstLockAcquired=false;
			boolean isSecondLockAcquired=false;
			
			try {
				isFirstLockAcquired=firstLock.tryLock();
				isSecondLockAcquired=secondLock.tryLock();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(isFirstLockAcquired && isSecondLockAcquired) {
					return;
				}
				if(isFirstLockAcquired) {
					firstLock.unlock();
				}
				if(isSecondLockAcquired) {
					secondLock.unlock();
				}
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		
			}

	public void firstThread() {
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			acquireAccountLocks(lock1,lock2);
			try {
				Account.tranferMoney(account1, account2, random.nextInt(100));
			} catch (Exception e) {
				e.getStackTrace();
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}
	}

	public void secondThread() {
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			acquireAccountLocks(lock2,lock1);

			try {
				Account.tranferMoney(account2, account1, random.nextInt(100));
			} catch (Exception e) {
				e.getStackTrace();
			} finally {
				lock1.unlock();
				lock2.unlock();

			}

		}
	}

	public void finished() {
		System.out.println("Account1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance());
		System.out.println("Total balance:" + (account1.getBalance() + account2.getBalance()));
	}
}
