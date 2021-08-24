package com.CoreProgram;

import java.util.*;

public class LeapYear {
	
	
	public static void leapYear() {
		int year;
	
	Scanner r = new Scanner(System.in);
	System.out.println("Enter the value of year to find if it is leap or not");
	
	year=r.nextInt();
	
	if(year <=999 && year>9999)
	{
		System.out.println("Invalid input");
		//System.exit(0);
		return ;
	}
	 if(((year%4==0) && (year%100!=0)) || (year%400==0)){
		System.out.println(year+" is leap year");
		
	}
	 else {
		 System.out.println(year+" is not a leap year");
	 }
	 //r.close();
	 System.out.println("=============================================");
	
	}
	

}
