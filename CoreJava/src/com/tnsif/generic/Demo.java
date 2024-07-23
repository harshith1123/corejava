package com.tnsif.generic;

public class Demo {
	public static void main() {
		Generic <String>stringobj=new Generic();
		stringobj.setData("harsha");
		System.out.println("string value="+stringobj.getData());
		
		
		Generic<Integer>intobj =new Generic();
		intobj.setData(21);
		System.out.println("Integer value="+intobj.getData());
		
		Generic<Double>doubleobj =new Generic();
		doubleobj.setData(22.67);
		System.out.println("double value="+doubleobj.getData());
	}
}
