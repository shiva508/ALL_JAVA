package com.dasari.oops.thisex;

public class Student {
	private Integer rollNo;
	private String name;
	private Float fee;
	
	public Student(Integer rollNo,String name,Float fee) {
		rollNo=rollNo;
		name=name;
		fee=fee;
	}
	
	public void displayStudentDetails() {
		System.out.println("Roll no:"+rollNo+" ,name:"+name+",fee:"+fee+"");
	}
}
