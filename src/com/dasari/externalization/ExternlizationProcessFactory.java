package com.dasari.externalization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternlizationProcessFactory<T> {
	public void processSeriallization(T inputObject) {
		try {
			System.out.println("Serialization Started");
			FileOutputStream outputStream=new FileOutputStream(inputObject.getClass().getName()+".ser");
			ObjectOutputStream stream=new ObjectOutputStream(outputStream);
			stream.writeObject(inputObject);
			System.out.println("Serialization completed");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
