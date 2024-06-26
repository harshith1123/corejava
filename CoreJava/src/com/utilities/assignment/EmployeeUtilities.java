package com.utilities.assignment;
import com.employees.assignment.Employee;  // importing the Employee class from com.employees.assignment package

public class EmployeeUtilities {
	public static void main(String[] args) {
		EmployeeUtilities emp=new EmployeeUtilities();
		emp.emputilities();
	}
	
	public void emputilities() {
		Employee em=new Employee(); // object Creation
		em.setName("Elon Musk"); // Calling all the methods of Employee class 
		em.setEmployeeId(32);
		em.setSalary(40000);
		em.setProjname("Java FullStack");
		em.setManagersalary(90000);					
		em.show();
		
	}
}
