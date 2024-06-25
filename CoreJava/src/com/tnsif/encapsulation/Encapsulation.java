package com.tnsif.encapsulation;

public class Encapsulation {
	int serialNum=10;   // Data variables or Data members
	private String name;
	int age;
	
	void show() {
		System.out.println("Serial number:"+serialNum+"\t"+"Name:"+name+"\t"+"Age:"+age);
	}
	
	
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
