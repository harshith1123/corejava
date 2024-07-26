package com.tnsif.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using Of method		
		Stream<Integer> ob=Stream.of(10,20,30,40,50);
		System.out.println(ob);
		ob.forEach(System.out::println);
		
		// using stream method
		
		Integer [] values=new Integer[] {2,3,5,8};
		ob=Arrays.stream(values);
		ob.forEach(System.out::println);
		
		
		Integer [] value=new Integer[] {1,2,3,4,5}; // get the input from arrays
		Stream<Integer> stream=Arrays.stream(value);  // create a stream using stream method
		
		// map function
		
		System.out.println("Square of a number"+Arrays.toString(value));
//		stream.map(num->num*num).forEach(System.out::println);
//		stream.map(num->num*num).filter(ele->ele*2==0).forEach(ele->System.out.print);
		stream.map(num->num*num).forEach(System.out::println);
		
		stream.filter(ele->ele %2==0).forEach(System.out::println);
		
		System.out.println("limit operation");
		Integer[] valu=new Integer[] {1,2,3,4,5};  // get the input from arrays
		Stream<Integer> streamobj=Arrays.stream(valu);
		
		
		
	}

}
