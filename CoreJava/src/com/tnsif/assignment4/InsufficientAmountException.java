package com.tnsif.assignment4;

public class InsufficientAmountException extends Exception{
	private String withdraw;
	
	public InsufficientAmountException(String withdraw) {
		super();
		this.withdraw=withdraw;
	}
	

}
