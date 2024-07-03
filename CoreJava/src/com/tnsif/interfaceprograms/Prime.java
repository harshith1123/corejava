package com.tnsif.interfaceprograms;

public class Prime implements Amazon,Flipkart{

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome user prime member");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for visiting amazon website");
	}

}
