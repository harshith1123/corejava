// Program to demonstrate Single inheritance
package com.tsnif.inheritance;

public class Customer {
	private String name;
	private int id;
	private long adharNo;
	private long phoneNo;
	
	// default constructor
	public Customer() {
		super();
	}
	// parameterized constructor
	public Customer(String name, int id, long adharNo, long phoneNo) {
		super();
		this.name = name;
		this.id = id;
		this.adharNo = adharNo;
		this.phoneNo = phoneNo;
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
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the adharNo
	 */
	public long getAdharNo() {
		return adharNo;
	}
	/**
	 * @param adharNo the adharNo to set
	 */
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	/**
	 * @return the phoneNo
	 */
	public long getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
}
