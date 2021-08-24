package com.CoreProgram;

import java.util.Scanner;

public class OddOrEven {
	
	public static void oddOreven() {
		int number;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the value to find if it is odd or even");
		number=r.nextInt();
		
		//r.close();
		
		if(number % 2 == 0) {
			System.out.println(number+" is even");
		}
		else
			System.out.println(number+" is odd");
			
	}

}
