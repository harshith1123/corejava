package com.tnsif.collections;

import java.util.Comparator;

public class SortRoll implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}

}
