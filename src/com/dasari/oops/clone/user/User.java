package com.dasari.oops.clone.user;

public class User implements Cloneable {
	private Integer userId;
	private String userName;
	private String email;
	private Department department;

	
	public User(Integer userId, String userName, String email, Department department) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.department = department;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		//DEEP CLONING CODE
		User deepClonewUser=(User) super.clone();
		deepClonewUser.setDepartment((Department)deepClonewUser.getDepartment().clone());
		
		//SWALLOW CLONING
		//return super.clone();
		return deepClonewUser;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", department=" + department
				+ "]";
	}
	
	
}
