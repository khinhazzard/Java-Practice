package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/addition-of-two-numbers/0

//4:10 PM 4/15/2018
//4:13 PM 4/15/2018

import java.util.Scanner;

public class GFG_15_AdditionOf2Num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		// testcase
		int tc = sc.nextInt();

		while (tc-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// return sum
			System.out.print(a + b);

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * Given two numbers a and b, return their sum.
 * 
 * Input:
 * 
 * The first line of the input contains T denoting the total number of
 * testcases. Each testcase contains two space separated positive integers
 * denoting the value of a and b.
 * 
 * Output:
 * 
 * Output the sum of a and b.
 */