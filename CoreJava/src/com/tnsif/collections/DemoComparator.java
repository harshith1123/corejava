package com.tnsif.collections;
import java.util.ArrayList;
import java.util.Collections;
public class DemoComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student(222,"aaa","Paris"));
		arr.add(new Student(242,"bbb","Mumbai"));
		arr.add(new Student(322,"ccc","New york"));
		
		System.out.println("_________________");
		Collections.sort(arr,new SortRoll());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("_________________");
		Collections.sort(arr,new SortName());
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}
