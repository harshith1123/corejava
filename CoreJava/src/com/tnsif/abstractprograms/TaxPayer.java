// program to demonstrate abstract class
package com.tnsif.abstractprograms;

// Non concrete class
public abstract class TaxPayer {
	protected double salary;
	public abstract double callTax();// abstract method
	public void display() {
		System.out.println("the tax payed is"+salary);
	}
	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}
	
	

}
