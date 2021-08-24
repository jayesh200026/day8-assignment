package com.CoreProgram;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlipCoin {

	static double head;
	static double tail;

	public static void flipcoin() {

		Scanner r = new Scanner(System.in);
		System.out.println("Enter the value of n to flip a coin");
		int n = r.nextInt();

		if (n < 0) {
			System.out.println("Negative value entered");
			return ;
		}
		//r.close();
		for (int i = 0; i < n; i++) {
			float outcome = (float) Math.random();

			if (outcome < 0.5) {
				tail++;
			} else
				head++;

		}
		double headPercentage = (double) (head / n) * 100;
		double tailPercentage = (double) (tail / n) * 100;

		System.out.println("Head percentage is=" + headPercentage + "%");
		System.out.println("Tail percentage is=" + tailPercentage + "%");

		System.out.println("=============================================");

	}

}
