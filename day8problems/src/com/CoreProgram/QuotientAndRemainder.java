package com.CoreProgram;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void quotientAndRemainder() {
		double divident,divisor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of divident");
		divident=sc.nextDouble();
		System.out.println("Enter the value of divisor");
		divisor=sc.nextDouble();
		
		double remainder;
		int quotient;
		remainder=divident % divisor;
		quotient=(int)(divident / divisor);
		
		System.out.println("Quotient="+ quotient);
		System.out.println("Remainder="+String.format("%.3f", remainder));
	}
	
	
	

}
