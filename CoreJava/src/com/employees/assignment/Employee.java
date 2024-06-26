package com.employees.assignment;

public class Employee {
	private String name;  //private data variables 
	private int employeeId;
	private int salary;	
	private String projname; // Additional Attributes
	private int managersalary; // Additional Attributes
	public void show() {
		System.out.println("Name="+name+"\t"+"Employee Id="+employeeId+"\t"+"Salary="+salary+"\t"+"Project Name="+projname+"\t"+"Manager salary="+managersalary);		
	}
	
	
	/**
	 * @return the managersalary
	 */
	public int getManagersalary() {
		return managersalary;
	}


	/**
	 * @return the projname
	 */
	public String getProjname() {
		return projname;
	}


	/**
	 * @param projname the projname to set
	 */
	public void setProjname(String projname) {
		this.projname = projname;
	}


	/**
	 * @param managersalary the managersalary to set
	 */
	public void setManagersalary(int managersalary) {
		this.managersalary = managersalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", projname=" + projname
				+ ", managersalary=" + managersalary + "]";
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
