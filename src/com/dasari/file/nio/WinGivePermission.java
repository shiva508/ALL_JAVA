package com.dasari.file.nio;

import java.io.IOException;

public class WinGivePermission extends Thread{
	String directryPath = "E:/Shiva/myfiles";
	String filePath = "E:/Shiva/myfiles/shiva.txt";
@Override
public void run() {
	try {
		removePermissions(directryPath,filePath);
	} catch (IOException e) {
		e.printStackTrace();
	}	
}
public void removePermissions(String directryPath, String filePath) throws IOException {
	Process jzsdasj=Runtime.getRuntime().exec("icacls "+filePath+" /grant Everyone:M");

}
}
