package com.tnsif.lambdaexp;
import java.util.*;

public class LambdaCollections {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(22);
		li.add(36);
		li.add(44);
		li.forEach(e-> System.out.println(e));
	}

}
