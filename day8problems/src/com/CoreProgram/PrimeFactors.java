package com.CoreProgram;

import java.util.Scanner;

public class PrimeFactors {
	public static void primeFactors() {
		int number,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its prime factorization::");
		number = sc.nextInt();
		num=number;
		System.out.println("Prime factors of "+number +" are:");
		for (int i = 2; i <=number/2; i++) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}
		}
		if(num == number)
		{
			System.out.println(number+" is a prime number and cannot be factorized");
		}
		//sc.close();
		
	}
}
