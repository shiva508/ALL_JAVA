package com.dasari.featurs9;

public class Resource implements AutoCloseable {

	
	public Resource() {
		System.out.println("Created");
	}
	public void data() {
		System.out.println("data");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Close");
	}

}
