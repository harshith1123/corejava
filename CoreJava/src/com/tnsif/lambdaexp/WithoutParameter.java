package com.tnsif.lambdaexp;

public class WithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m=()->{return "hello";};
		System.out.println(m.greet());
		
		Cube c=(int cu)->{
			return cu*cu*cu;};
			System.out.println(c.cal(5));
		}
	}
