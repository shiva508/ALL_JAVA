package com.dasari.featurs9.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws FileNotFoundException {
		withJava7();
		withJava9();
	}

	private static void withJava9() throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader("shiva.txt"));
		try (reader) {
			System.out.println(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void withJava7() throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader("shiva.txt"));
		try (BufferedReader readerBuffer = reader) {
			System.out.println(readerBuffer.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
