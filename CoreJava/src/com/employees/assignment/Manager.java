package com.employees.assignment;

public class Manager {
	public static void main(String[] args) {  // Object Creation
		Employee m=new Employee();
		m.setName("harsha");
		m.setEmployeeId(47);
		m.setSalary(50000);
		m.setManagersalary(80000);	
		m.show(); // calling the method
	}
}
