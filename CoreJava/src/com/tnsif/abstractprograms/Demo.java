package com.tnsif.abstractprograms;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of Akash:");
		double akashsalary=sc.nextDouble();		
		TaxPayer obj;
		obj=new Akash(akashsalary);
		obj.callTax();
		System.out.println("Tax akash:");
		obj.display();
		
		System.out.println("Enter the salary of Hitesha:");
		double hiteshasalary=sc.nextDouble();
		TaxPayer ob=new Hitesha(hiteshasalary);
		ob.callTax();
					
		System.out.println("Tax Hitesha:");
		ob.display();
	}

}
