package com.FuntionalProgram;

import java.util.Scanner;

public class Roots {
	
	public static void quadraticRoots() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 coeffients");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		
		double delta = Math.pow(b, 2) - (4*a*c);
		double root1 = (-b + Math.sqrt(delta))/2*a;
		double root2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("\nRoot 1 = " + root1 + "\tRoot 2 = " + root2);
	}

}
