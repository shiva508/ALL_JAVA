package com.dasari.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RetrievingInformationFilesystem {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\Users\\shiva\\Downloads\\JavaNotesForProfessionals.pdf");
		Path p2 = Paths.get("/home/");
		System.out.println(Files.isDirectory(p1));
		System.out.println(Files.isDirectory(p2));
		System.out.println(Files.isRegularFile(p1));
		System.out.println(Files.isRegularFile(p2));
		System.out.println("PROPERTIES ");
		System.out.println(Files.isReadable(p1));
		System.out.println(Files.isWritable(p1));
		System.out.println(Files.isExecutable(p1));
		System.out.println(Files.isHidden(p1));
		System.out.println(Files.isSymbolicLink(p1));
		System.out.println(Files.probeContentType(p1));
		Path p3 = Paths.get("C:\\Users\\shiva\\Downloads\\shiva.txt");
		Path p4 = Paths.get("C:\\Users\\shiva\\Downloads\\shiva1.txt");
		byte[] byteText = Files.readAllBytes(p3);
		for (int i = 0; i < byteText.length; i++) {
			System.out.println(byteText[i]);
		}
		List<String> linesOfContent = Files.readAllLines(p3);
		System.out.println("length:" + linesOfContent.size());
		for (String string : linesOfContent) {
			System.out.println(string + "\n");
		}
	}
}
