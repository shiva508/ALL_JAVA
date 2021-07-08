package com.dasari.featurs8.io.filehidden;

import java.io.*;

public class HiddenClient {
	public static void main(String[] args) {
		File[] hiddenFiles = new File(".").listFiles(File::isHidden);
		for (int i = 0; i < hiddenFiles.length; i++) {
			System.out.println(hiddenFiles.toString());
		}
	}
}
