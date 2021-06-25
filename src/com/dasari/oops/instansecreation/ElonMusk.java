package com.dasari.oops.instansecreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ElonMusk implements Cloneable,Serializable{

	public ElonMusk() {
		super();
	}

	public static int rollNumber = 408;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// Using new Keyword
		ElonMusk elonMusk = new ElonMusk();
		System.out.println(elonMusk.rollNumber + ":" + elonMusk.hashCode());
		// using Class class's newInstance method
		ElonMusk elonMusk2 = ElonMusk.class.newInstance();
		System.out.println(elonMusk2.rollNumber + ":" + elonMusk2.hashCode());
		// Using Class class's getConstroctor()
		Constructor<ElonMusk> constroctor = ElonMusk.class.getConstructor();
		ElonMusk elonMusk3 = constroctor.newInstance();
		System.out.println(elonMusk3.rollNumber + ":" + elonMusk3.hashCode());
		// using clone
		ElonMusk elonMusk4 = (ElonMusk) elonMusk3.clone();
		System.out.println(elonMusk4.rollNumber + ":" + elonMusk4.hashCode());

		// seralization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
		out.writeObject(elonMusk4);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		ElonMusk elonMusk5 = (ElonMusk) in.readObject();
		System.out.println(elonMusk5.rollNumber + ":" + elonMusk5.hashCode());
	}
}
