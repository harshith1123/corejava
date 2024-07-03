package com.tnsif.interfaceprograms;

public interface Flipkart {
	void welcome();
	void thankyou();
	
	public static int sales=2100;
	
	static void aboutuse() {
		System.out.println("It is a eccomerce website");
	}
	default void displayFlipkart() {
		if(sales<500) {
			System.out.println("There is a sales in our Flipkart Website");
		}
		else {
			System.out.println("There is no sales in our Flipkart website");
		}
	}

}
