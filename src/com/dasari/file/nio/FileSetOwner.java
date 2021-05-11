package com.dasari.file.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

public class FileSetOwner {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("E:/Shiva/shiva1.txt");
		System.out.println("File :" + path);
		System.out.println("Exists :" + Files.exists(path));
		System.out.println("-- owner before --");
		UserPrincipal owner = Files.getOwner(path);
		System.out.println("Owner :" + owner);
		System.out.println("-- lookup other user --");
		FileSystem fileStstem = path.getFileSystem();
		UserPrincipalLookupService service = fileStstem.getUserPrincipalLookupService();
		UserPrincipal userPrincipal = service.lookupPrincipalByName("Administrator");
		System.out.println("Found UserPrincipal: " + userPrincipal);
		UserPrincipal userPrincipal1 = service.lookupPrincipalByName("AuthenticatedUsers");
		System.out.println("Found UserPrincipal: " + userPrincipal1);
	}
}
