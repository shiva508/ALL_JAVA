package com.dasari.oops.THIS;

public class Student {
	private Integer rollNo;
	private String name;
	private Float fee;
	
	public Student(Integer rollNo,String name,Float fee) {
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	
	public void displayStudentDetails() {
		System.out.println("Roll no:"+rollNo+" ,name:"+name+",fee:"+fee+"");
	}
}
