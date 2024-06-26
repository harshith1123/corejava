package com.harshit.assignment2;

public class AssignmentMain {
	public static void main(String[] args) {
		Student st=new Student(); // creating an object of class student which calls the default constructor i.e Student
		Commission com=new Commission(); // Creating an object of class Commission							
		com.setName("Harshit");
		com.setAddress("Bangalore");
		com.setPhone(123);
		com.setSales_amount(100000);		
		com.show();
		
		com.details();		
		System.out.println(com);
		
		com.calculate(); // calling a calculate method to identify the commission 
	}
}
