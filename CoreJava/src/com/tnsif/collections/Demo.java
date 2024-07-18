package com.tnsif.collections;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop>laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",55000,16));
		laps.add(new Laptop("Assus",45000,8));
		laps.add(new Laptop("Hp",63000,4));
		Collections.sort(laps);
		for(Laptop l: laps) {
			System.out.println(l);
		}
	}

}
