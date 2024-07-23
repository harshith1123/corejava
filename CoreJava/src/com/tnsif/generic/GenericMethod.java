package com.tnsif.generic;

public class GenericMethod {
	public<T> void displayArrayElements(T elements[]) {
		for(T ele:elements) {
			System.out.println("elements is:"+ele);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj=new GenericMethod();
		Integer[] intarray= {10,20,30};
		String [] strarray= {"hello", "hai"};
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(strarray);
	}

}
