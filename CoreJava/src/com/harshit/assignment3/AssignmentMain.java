package com.harshit.assignment3;
import java.util.Scanner;  // import Scanner class from util package

public class AssignmentMain {
	
	public static void main(String[] args) {
		details();				
	}
	public static void details() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the state:");
		String statename=sc.next();
		System.out.print("Enter the name of the state language:");
		String lang=sc.next();
		System.out.print("Enter the size of the state:");
		float statesize=sc.nextFloat();
		System.out.print("Enter the number of districts:");
		int noofdistricts=sc.nextInt();
		System.out.print("Enter the name of the country:");
		String countryname=sc.next();
		System.out.print("Enter the size of the country:");
		float countrysize=sc.nextFloat();
		System.out.println("Enter the country language:");
		String countlang=sc.next();
		System.out.print("Enter the number of continents:");
		int noofcont=sc.nextInt();
		System.out.print("Enter the name of the continent:");
		String contname=sc.next();
		System.out.println("Enter the size of the continent:");
		float contsize=sc.nextFloat();
		
		Continent obj=new Continent(statename,lang,statesize,noofdistricts,countryname,countrysize,countlang,noofcont,contname,contsize);
		System.out.println(obj);
	}
	
}
