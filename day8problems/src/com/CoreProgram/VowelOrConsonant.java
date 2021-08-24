package com.CoreProgram;

import java.util.Scanner;

public class VowelOrConsonant {
	
	public static void vowelOrConsonant() {
		char alphabet;
		Scanner r = new Scanner(System.in);
		char[] vowelarray= {'a','e','i','o','u','A','E','I','O','U'};
		
		System.out.println("Enter one alphabet to find if it is Vowel or consonat");
		
		alphabet=r.next().charAt(0);
		if(! Character.isAlphabetic(alphabet))
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		for(char ch:vowelarray)
		{
			if(ch==alphabet)
			{
				System.out.println(alphabet+" is vowel");
				return ;
			}
		}
		System.out.println(alphabet+" is consonant");
	}

}
