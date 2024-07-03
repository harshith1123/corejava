package com.tnsif.interfaceprograms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon.aboutUs();
		Amazon ob=new NonPrime();
		ob.serviceCharge();
		ob.welcome();
		ob.thankyou();
		
		Amazon obj=new Prime();
		obj.welcome();
		obj.thankyou();
		obj.display();
		
		Flipkart object=new Prime();
		object.welcome();
		object.thankyou();
		object.displayFlipkart();
	}

}
