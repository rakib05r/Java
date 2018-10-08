package com.a;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y;
		int sum;
		System.out.println("Enter 1st value\n");
		x=s.nextInt();
		System.out.println("Enter 2nd value\n");
		y=s.nextInt();
		sum=addd(x,y);
		System.out.println("Addition of "+x+" and "+y+" is "+sum);
		
	}
	public static int addd(int a,int b){
		return a+b;
	}
}
