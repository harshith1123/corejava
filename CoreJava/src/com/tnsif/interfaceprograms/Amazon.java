/** program to demonstrate interface
 * 
 */
package com.tnsif.interfaceprograms;

/**
 * 
 */
public interface Amazon {
//	int a; because interface variable cannot have instance variable
	public int sales=500;
	void welcome();
	void thankyou();
	
	default void serviceCharge() {
		int amt=100;
		System.out.println("The service charge is:"+amt);
	}
	static void aboutUs() {
		System.out.println("It's a ecommerce website");
	}
	default void display() {
		if(sales<1000) {
			System.out.println("There is sales in our amazon website");
		}
	}
}
