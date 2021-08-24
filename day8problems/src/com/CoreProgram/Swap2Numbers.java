package com.CoreProgram;

import java.util.Scanner;

public class Swap2Numbers {
	public static void swap2Numbers()
	{
		int a,b,temp;
		
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		a=r.nextInt();
		b=r.nextInt();
		System.out.println("Before swapping a= "+a+" and b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a= "+a+" and b= "+b);
		
		//r.close();
	}

}
