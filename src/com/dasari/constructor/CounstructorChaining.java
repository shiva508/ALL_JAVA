package com.dasari.constructor;

public class CounstructorChaining {

	public CounstructorChaining() {
		this("Hi !,");
	}

	public CounstructorChaining(String message1) {
		this(message1, "How Are You?");
	}

	public CounstructorChaining(String message1, String message2) {
		System.out.println(message1+" "+message2);
	}
}
