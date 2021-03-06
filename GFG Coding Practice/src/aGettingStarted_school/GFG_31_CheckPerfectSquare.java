package aGettingStarted_school;

//https://practice.geeksforgeeks.org/problems/check-if-a-number-is-perfect-square/0

//8:38 AM 4/24/2018
//8:48 AM 4/24/2018

import java.util.Scanner;

public class GFG_31_CheckPerfectSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input");
		int tc = sc.nextInt();

		while (tc-- > 0) {
			// enter num
			int n = sc.nextInt();

			// check if it's a perfect square
			int check = checkSqrt(n);
			// display result
			System.out.print(check);
			
			if (tc > 0)
				System.out.println();
		}
	}

	static int checkSqrt(int n) {
		int r = (int) Math.sqrt(n);

		if (r * r == n) {
			//its a perfect square
			return 1;
		} else {
			//nope
			return 0;
		}
	}
}

/*
 * Given a natural number n, print 1 if it is perfect square else 0.
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. The first line of each test case is N, N is the number to be
 * checked whether perfect square or not.
 * 
 * Output: 1 if it is perfect square else 0
 */

// Constraints:
// 1 <= T <= 30
// 1 <= N <= 100000
//
// Example:
// Input:
// 3
// 100
// 10
// 125
//
// Output:
// 1
// 0
// 0