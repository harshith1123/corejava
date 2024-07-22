package com.tnsif.lambdaexp;
import java.util.Scanner;
public class Find_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number for find factorial:");
		int num=scan.nextInt();
		
		Factorial factorial=(n)->{
			int f=1,i;
			for(i=1;i<=n;i++) {
				f=i*f;
			}
			return f;
		};
		int result=factorial.cal(num);
		System.out.println(result);
	}
	
	

}
