package com.tnsif.generic;

import java.util.ArrayList;

public class GenericsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list =new ArrayList(); // raw type
		ArrayList<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add(123);
		for(Object object: list)
		{
//       Below Statement throws ClassCastExpception at run time			
			String str=(String) object;
			System.out.println(str);
		}

	}

}
