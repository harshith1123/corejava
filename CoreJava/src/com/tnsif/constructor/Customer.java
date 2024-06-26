package com.tnsif.constructor;

public class Customer {
	private int id;
	private String name;
	
	public Customer() {
		super();
		System.out.println("---default constructor");
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
