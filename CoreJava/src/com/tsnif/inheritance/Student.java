package com.tsnif.inheritance;

public class Student extends Customer{
	private String collegeName;
	private int rollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int id, long adharNo, long phoneNo,String collegeName,int rollno) {
		super(name, id, adharNo, phoneNo);
		// TODO Auto-generated constructor stub
		this.collegeName=collegeName;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollno=" + rollno + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()=" + getPhoneNo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
