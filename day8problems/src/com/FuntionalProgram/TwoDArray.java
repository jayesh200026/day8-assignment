package com.FuntionalProgram;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	public static void twodarry() {
int row,col;
		
		Scanner r = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
		
		out.println("Enter the number of Rows");
		row = r.nextInt();
		out.println("Enter the number of Columns");
		col = r.nextInt();
		
		int[][] array = new int [row][col];
		
		out.println("Enter the Array Elements\n");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				array [i][j] = r.nextInt();
			}
		}
		
		r.close();
		
		out.println("Array Elements are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				out.print(array[i][j] + "\t");
			}
			out.println();
		}
		
	}

}
