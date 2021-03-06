package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/npr/0

//6:47 AM 4/24/2018
//7:36 AM 4/24/2018

import java.util.Scanner;

public class GFG_27_nPr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter values for n and r
			int n = sc.nextInt();
			int r = sc.nextInt();

			// compute nPr
			long npr = compute(n, r);

			// display result
			System.out.print(npr);

			if (tc > 0)
				System.out.println();
		}
	}

	static long compute(int n, int r) {

		long result = factorial(n) / factorial(n - r);

		return result;
	}

	static long factorial(int num) {
		long f = num;

		// factorial of 0! == 1
		if (num == 0) {
			return 1;
		}

		while (num-- > 1) {
			f *= num;
		}

		return f;
	}
}

// formula: (n!) / (n-r)!

/*
 * 
 * Write a program to calculate nPr. nPr represents n permutation r and value of
 * nPr is (n!) / (n-r)!.
 * 
 * Input: The first line of the input contains T denoting the number of
 * testcases. First line of the test case will be the value of n and r
 * respectively. Output: For each test case output will be the value of nPr.
 */

// Example:
//
// Input:
//
// 2
// 2 1
// 10 4
//
// Output:
//
// 2
// 5040