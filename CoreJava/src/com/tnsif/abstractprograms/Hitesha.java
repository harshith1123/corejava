package com.tnsif.abstractprograms;

public class Hitesha extends TaxPayer{

	@Override
	public double callTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}

	public Hitesha(double salary) {
		super(salary);
	}
	
}
