package com.dasari.file.nio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcesser {
	public static void main(String[] args) {

		//accessfile();
		String path = "E:/Shiva/myfiles/shiva.txt";
		// editfilePermissions(true, path);
		String directryPath = "E:/Shiva/myfiles";
		String filePath = "E:/Shiva/myfiles/shiva.txt";
		removePermissions(directryPath, filePath);
		// editfilePermissions(true, path);
		makeFolderAndFileUnDeletable(directryPath, filePath);
	}

	private static void removePermissions(String directryPath, String filePath) {
		try {
			Process DirectoryProcessGrant = Runtime.getRuntime().exec("icacls " + directryPath + " /grant Everyone:F");
		} catch (Exception e) {
		} finally {
			//ENABLE DELETE
			try {
				Process DirectoryProcessGrant = Runtime.getRuntime().exec("icacls " + directryPath + " /grant Everyone:(OI)(CI)(DE,DC)");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// ENABLE READ
			try {
				Process DirectoryProcesssadsds = Runtime.getRuntime().exec("icacls " + filePath + " /grant Everyone:R");
			} catch (IOException e) {
				e.printStackTrace();
			}
			//ENABLE MODIFY
			try {
				Process jzsdasj = Runtime.getRuntime().exec("icacls " + filePath + " /grant Everyone:M");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//ENABLE READ ONLY FOR CHILD
			try {
				Process jzsdasjdfsd = Runtime.getRuntime().exec("icacls " + filePath + " /grant  Everyone:R /T");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void makeFolderAndFileUnDeletable(String directryPath, String filePath)  {
		try {
			String path = "E:/Shiva/myfiles/shiva.txt";
			File file = new File(path);
			file.setWritable(true);
			FileWriter write = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(write);
			bufferedWriter.write(" What happend to you?????");
			bufferedWriter.close();
			write.close();
			file.setWritable(false);
			copyData();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// THIS USED TO SET READ ONLY MODE
			//Process DirectoryProcesssadasdasd= Runtime.getRuntime().exec("attrib +R "+filePath);
			//THIS IS USED TO PREVENT FROM DELETING FILE
			try {
				Process DirectoryProcess = Runtime.getRuntime().exec("icacls " + directryPath + " /deny Everyone:(OI)(CI)(DE,DC) ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			//THIS IS USED TO PREVENT FILE FROM MODIFIED
			try {
				Process DirectoryProcesssad = Runtime.getRuntime().exec("icacls " + filePath + " /deny Everyone:M");
			} catch (IOException e) {
				e.printStackTrace();
			}
			//THIS IS USED TO PREVEN FILE AND IT'S CHILD READ ONLY 
			try {
				Process DirectoryProcesssadxvc = Runtime.getRuntime().exec("icacls " + filePath + " /deny Everyone:R /T ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// THIS USED TO SET READ ONLY MODE
			try {
				Process DirectoryProcesssadsds = Runtime.getRuntime().exec("icacls " + filePath + " /grant Everyone:R ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void editfilePermissions(boolean b, String path) {
		try {
			Path filePath = Paths.get(path);
			File file = filePath.toFile();
			System.out.println(Files.getOwner(filePath));
			// BEFORE EDIT CHANGE PERMISION TO WRITE
			file.setWritable(true);
			String sampleText = "HOW ARE YOU???????";
			FileOutputStream writeTofile = new FileOutputStream(file);
			writeTofile.write(sampleText.getBytes());
			writeTofile.close();
			// AFTER WRITING CHANGE PERMISION TO READ ONLY
			file.setWritable(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void accessfile() throws IOException {
		Path path = Paths.get("E:/Shiva/myfiles/shiva.txt");
		File filePath = path.toFile();
		if (!filePath.exists()) {
			// CREATE FILE IF FILE DOSE NOT EXIST
			filePath.createNewFile();
			// SET PERMISION ON CREATING
			// SET TO READ FILE READ ONLY
			filePath.setReadOnly();
		}
	}

	public static void copyData() throws IOException {
		FileInputStream input = new FileInputStream(new File("E:/Shiva/myfiles/shiva.txt"));
		FileOutputStream output = new FileOutputStream(new File("E:/Shiva/myfiles/shiva1.txt"));
		byte[] buffer = new byte[1024];
		int length;
		while ((length = input.read(buffer)) > 0) {
			output.write(buffer, 0, length);
		}
	}
}
