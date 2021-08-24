package com.CoreProgram;



public class PowerOf2 {
	
	public static void powerOf2(int value) {
		int powerof2=1; //2^powerof2
		if (value>=31)
		{
			System.out.println("Invalid or out of range input");
			return ;
		}
		
		for (int i=0;i<=value;i++)
		{
			System.out.println(i+"  "+powerof2);
			powerof2 = 2 * powerof2;
		}
		
		
		System.out.println("=============================================");
		
	}

}
