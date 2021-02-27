package com.dasari.hashcodeEquals;

public class Person {
	private Integer personid;
	private String personName;

	public Integer getPersonid() {
		return personid;
	}

	public Person setPersonid(Integer personid) {
		this.personid = personid;
		return this;
	}

	public String getPersonName() {
		return personName;
	}

	public Person setPersonName(String personName) {
		this.personName = personName;
		return this;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + "]";
	}

	

	@Override
	public int hashCode() {
		
		return this.getPersonid();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
	
		if (personid == null) {
			if (other.personid != null)
				return false;
		} else if (!personid.equals(other.personid))
			return false;
		return true;
	}

}
