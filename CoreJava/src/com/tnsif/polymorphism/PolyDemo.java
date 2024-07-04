package com.tnsif.polymorphism;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point ob=new Point();
		System.out.println(ob);
		Point obtwo=new Point(2.3f,3.4f);
		System.out.println(obtwo);
		main();
	}
	public static void main() {
		System.out.println("hello");
		int arr[]= {1,2,3,4,5};
		main(arr);
	}
	public static void main(int[] num) {
	for(int i=0;i<5;i++) {
		System.out.println(num[i]);
	}
	}
}
