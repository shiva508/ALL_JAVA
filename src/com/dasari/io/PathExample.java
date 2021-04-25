package com.dasari.io;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	public static void main(String[] args) {
		Path p1 = Paths.get("a", "b", "c");
		System.out.println(p1.toString());
		Path p2 = Paths.get(URI.create("file:///home/testuser/File.txt"));
		System.out.println(p2.toString());
		Path p3 = Paths.get("C:\\Users\\shiva\\Downloads\\JavaNotesForProfessionals.pdf");
		System.out.println(p3.toString());
		Path p4 = Paths.get("/home", "arthur", "files", "diary.tex");
		System.out.println(p4.toString());
		// manupulating
		Path p5 = Paths.get("/home/");
		Path p6 = Paths.get("arthur/files");
		Path jpoind = p5.resolve(p6);
		System.out.println(jpoind.toString());
		Path jpoind1 = p6.resolve("shiva.pdf");
		System.out.println(jpoind1.toString());
		// get file information
		System.out.println(jpoind1.getFileName());
		System.out.println(jpoind1.getNameCount());
		System.out.println(p3.getRoot().toString());
		System.out.println(p5.getRoot().toString());

	}
}
