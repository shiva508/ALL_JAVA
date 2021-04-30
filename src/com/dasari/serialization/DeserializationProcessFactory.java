package com.dasari.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializationProcessFactory<T> {
//	public <T> ResponseObject<T> processDeserialization(String fileName, Class<T> clazz) {
//		ResponseObject<T> deserializedObject = null;
//		try {
//			FileInputStream fileInputStream = new FileInputStream(fileName);
//			ObjectInputStream stream = new ObjectInputStream(fileInputStream);
//			deserializedObject =(ResponseObject<T>) stream.readObject();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//		}
//		return deserializedObject;
//	}
	
	@SuppressWarnings("unchecked")
	public T processDeserialization(String fileName) {
		T deserializedObject = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream stream = new ObjectInputStream(fileInputStream);
			deserializedObject =(T) stream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		return deserializedObject;
	}
}
