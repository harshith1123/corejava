package com.employees.assignment;

public class Developer {
	public static void main(String[] args) {
		Employee d=new Employee();
		d.setName("harshit");
		d.setEmployeeId(48);
		d.setSalary(50000);
		d.setProjname("Core Java");
		System.out.println(d);  // To display the string representation of the object
	}
}
