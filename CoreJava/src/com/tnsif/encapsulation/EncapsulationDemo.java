package com.tnsif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation(); // Calling the variables
//		ob.name="suma";
		ob.age=20;
		ob.serialNum=48;
		ob.setName("Harshit");
//		ob.show();
		System.out.println(ob);
	}
}
