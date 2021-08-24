package com.CoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
	public static void harmonicNumber() {
		int N;
		double sum=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the value of N to find harmonic series");
		N=r.nextInt();
		
		if(N == 0)
			System.out.println("invalid input");
		
		System.out.println("Harmonic series is::");
		
		for(int i=1;i<=N;i++) {
			
			sum = sum+ (double) 1/i;
			System.out.print("  "+1+"/"+i+"   ");
			
		}
		
		System.out.println("\nSum of harmonic series is  "+String.format("%.3f", sum));
		
	}

}
