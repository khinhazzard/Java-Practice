package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/pattern-printing/0/?ref=self

//8:22 AM 4/24/2018
//8:35 AM 4/24/2018

import java.util.Scanner;

public class GFG_30_PatternPrinting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter n term
			int n = sc.nextInt();

			// print pattern
			print(n);

			if (tc > 0)
				System.out.println();
		}
	}

	static void print(int n) {
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j++ <= i) {
				System.out.print("*");
			}
			//add spaces between
			if (i < n-1)
				System.out.print(" ");
		}
	}
}

/*
 * Starting from one print a series of asterisk(*) till N terms with increasing
 * order and difference being 1.
 * 
 * Input: First line of the input is the number of test cases T. And first line
 * of test case contain the value of 'N'.
 * 
 * Output: Series of asterisk's is printed in a single line with one space
 * between each iteration.
 */
