package com.dasari.file.nio;

public class SynchronizedProcessor {

	public static void main(String[] args) {
		WinGivePermission givePermission=new WinGivePermission();
		WinGivePermission2 givePermission2=new WinGivePermission2();
		WinDnyPermission dnyPermission=new WinDnyPermission();
		givePermission.start();
		givePermission2.start();
		dnyPermission.start();
		try {
			givePermission.join();
			givePermission2.join();
			dnyPermission.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
