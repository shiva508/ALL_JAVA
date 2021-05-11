package com.dasari.file.nio;

import java.io.IOException;

public class WinGivePermission2 extends Thread {
	String directryPath = "E:/Shiva/myfiles";
	String filePath = "E:/Shiva/myfiles/shiva.txt";

	@Override
	public void run() {
		try {
			removePermissions(directryPath, filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void removePermissions(String directryPath, String filePath) throws IOException {
		Process DirectoryProcessGrant = Runtime.getRuntime().exec("icacls " + directryPath + " /grant Everyone:(OI)(CI)(DE,DC)");

	}
}
