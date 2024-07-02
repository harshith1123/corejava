package com.tnsif.abstractprograms;

public class Akash extends TaxPayer {

	@Override
	public double callTax() {
		// TODO Auto-generated method stub
		if(salary>=10000) {
			return salary*0.10;
		}
		return 0;
	}

	public Akash(double salary) {
		super(salary);
		
	}
	

}
