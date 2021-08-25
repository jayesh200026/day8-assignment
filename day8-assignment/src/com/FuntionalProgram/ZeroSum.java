package com.FuntionalProgram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSum {
	public static void triplets() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Size of the Array");
		int num = scanner.nextInt();
		int arr[] = new int[num];

		System.out.println("Enter the Array Elements");
		for(int i=0;i<num;i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		Set<String> triplet = new HashSet<String>();
		
		for(int i=0;i<num-2;i++) {
			if(arr[i]+arr[i+1]+arr[i+2]==0) {
				triplet.add("["+arr[i]+" "+arr[i+1]+" "+arr[i+2]+"]");
			}
		}
		System.out.println("Number of Distinct Triplets are " + triplet.size());
		if(triplet.size() != 0) {
			System.out.println("Distinct Triplets are ");
		}
		
		for(String item: triplet) {
			System.out.println(item);
		}
	}

}