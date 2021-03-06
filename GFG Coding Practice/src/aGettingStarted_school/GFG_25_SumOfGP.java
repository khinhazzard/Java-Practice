package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/sum-of-gp/0/?ref=self

import java.util.Scanner;

public class GFG_25_SumOfGP {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");

		int tc = sc.nextInt();

		while (tc-- > 0) {
			// get n, a, r
			int n = sc.nextInt();
			double a = sc.nextDouble();
			double r = sc.nextDouble();

			double sum = 0;
			for (int i = 0; i < n; i++) {
				if (i >= 1) {
					a *= r;
				}
				sum += a;
			}

			System.out.printf("%.6f",sum);

			if (tc > 0)
				System.out.println();
		}
	}
}

/*
 * 
 * Write a Program to calculate the sum of n terms of a Geometric Progression
 * when first term a and common ratio r is given.
 * 
 * Input: The first line of the input contains T denoting the number of
 * testcases. The first line of the test case will be the number of terms of GP
 * and second line its first term and common ratio.
 * 
 * Output: For each test case the output will be the sum of n terms of GP.
 */

// Constraints:
//
// 1 <= T<= 100
// 1 <= N <= 100
// 1 <= a,r <= 100
//
// Example:
//
// Input:
//
// 1
// 3
// 3 2
//
// Output:
//
// 21.000000

// geometric progression
// series of numbers: 3
// starting number: 3
// ratio:2
// 3 + 6 + 12
// 6 - (3*2), 12 -(6*2);