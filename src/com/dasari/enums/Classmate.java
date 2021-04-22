package com.dasari.enums;

public enum Classmate {
	SHIVA(508), NITHYA(504), INDU(502), MADHU(503),GEETHA;

	Integer rollNumber;

	Classmate(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	Classmate() {
		this.rollNumber = 501;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

}
