package com.harshit.assignment;
import com.employees.assignment.*; // Importing all the classes of com.employees.assignment
import com.utilities.assignment.*; // Importing all the classes of com.utilities.assignment

public class AssignmentMain {
	public static void main(String[] args) {
		Manager man=new Manager(); // creating the instance of Manager
		Developer dev=new Developer(); // creating the instance of Developer
		EmployeeUtilities emputil=new EmployeeUtilities(); // Calling the method of EmployeeUtilities class to execute Employee class attributes
		emputil.emputilities();
	}
}
