package com.harshit.assignment2;
import java.util.Scanner;  // import Scanner class from util package 
public class Commission {
	Scanner sc=new Scanner(System.in); // Creating an object of Scanner class
	private String name;
	private String address;
	private int phone;
	private int sales_amount;
	private double commission=0;


public void details() { // to get inputs from the user
	System.out.println("Enter the name:");
	name=sc.nextLine(); //getting a name 
	System.out.println("Enter the address:");
	address=sc.nextLine(); // getting an address
	System.out.println("Enter the phone number:");
	phone=sc.nextInt(); // getting a phone number
	System.out.println("Enter the sales amount:");
	sales_amount=sc.nextInt(); // getting a sales amount		
}

public void show() {
	System.out.println("Name:"+name+"\t"+"Address:"+address+"\t"+"phone:"+phone+"\t"+"Sales amount:"+sales_amount);
}
@Override
public String toString() {
	return "Details [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount=" + sales_amount
			+ "]";
}
/**
 * @return the name
 */
public String getName() {
	return name;
}

// * @param name the name to set
// */
public void setName(String name) {
	this.name = name;
}


// * @return the address

public String getAddress() {
	return address;
}

// * @param address the address to set
public void setAddress(String address) {
	this.address = address;
}

// * @return the phone

public int getPhone() {
	return phone;
}


// * @param phone the phone to set
public void setPhone(int phone) {
	this.phone = phone;
}

// * @return the sales_amount

public int getSales_amount() {
	return sales_amount;
}

/**
 * @param sales_amount the sales_amount to set
 */
public void setSales_amount(int sales_amount) {
	this.sales_amount = sales_amount;
	}

public void calculate() { // To calculate the commission
	if(sales_amount>=100000) {
		commission= (sales_amount * 0.10);
	}
	else if(sales_amount>=50000 && sales_amount<100000) {
		commission=(sales_amount *0.05);
	}
	else if(sales_amount>=30000 && sales_amount<50000) {
		commission=(sales_amount * 0.03);
	}
	else {
		commission=0;
	}
	System.out.println("Commission is:"+commission);
	}
}