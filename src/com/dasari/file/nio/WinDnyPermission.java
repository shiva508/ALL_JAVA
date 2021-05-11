package com.dasari.file.nio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WinDnyPermission extends Thread {
	String directryPath = "E:/Shiva/myfiles";
	String filePath = "E:/Shiva/myfiles/shiva.txt";
	@Override
	public void run() {
		try {
			makeFolderAndFileUnDeletable(directryPath,filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public  void makeFolderAndFileUnDeletable(String directryPath, String filePath) throws IOException  {
		String path = "E:/Shiva/myfiles/shiva.txt";
		File file = new File(path);
		file.setWritable(true);
		FileWriter write = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(write);
		bufferedWriter.write(" What happend to you?????");
		bufferedWriter.close();
		write.close();
		file.setWritable(true);
		Process DirectoryProcesssad= Runtime.getRuntime().exec("icacls "+filePath+" /remove:d Everyone /deny Everyone:M");
		Process DirectoryProcess = Runtime.getRuntime().exec("icacls "+directryPath+" /remove:d Everyone /deny Everyone:(OI)(CI)(DE,DC)");

	}
}
